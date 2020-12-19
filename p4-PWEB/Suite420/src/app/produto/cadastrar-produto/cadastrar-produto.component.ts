import { Component, OnInit } from '@angular/core';
import {Produto} from '../../shared/model/produto';
import {ActivatedRoute, Router} from '@angular/router';
import {MensagemService} from "../../shared/services/mensagem.service";
import {ProdutoService} from "../../shared/services/produto.service";

@Component({
  selector: 'app-cadastrar-produto',
  templateUrl: './cadastrar-produto.component.html',
  styleUrls: ['./cadastrar-produto.component.scss']
})
export class CadastrarProdutoComponent implements OnInit {
  produto: Produto;
  operacaoCadastro = true;

  constructor(private produtoService: ProdutoService, private rotaAtual: ActivatedRoute, private roteador: Router,
      private mensagemService: MensagemService) {
    this.produto = new Produto();
    if(this.rotaAtual.snapshot.paramMap.has('id')){
      this.operacaoCadastro = false;
      const idEdit = Number(this.rotaAtual.snapshot.paramMap.get('id'));
      this.produtoService.pesquisarId(idEdit).subscribe(
        produtoRetornado => this.produto = produtoRetornado
      );
    }
  }

  ngOnInit(): void {
  }

  cadastrarProduto(): void {
    if (this.produto.id) {
      this.produtoService.atualizar(this.produto).subscribe(
        produtoAlterado => {
          this.mensagemService.success("Produto alterado com sucesso!")
          this.roteador.navigate(['listagemproduto']);
        }
      );
    } else {
      this.produtoService.inserir(this.produto).subscribe(
        produtoInserido => {
          this.mensagemService.success("Produto inserido com sucesso!");
          this.roteador.navigate(['listagemproduto']);
        }
      );
    }
  }
}
