import { Component, OnInit } from '@angular/core';
import {Produto} from '../../shared/model/produto';
import {Router} from '@angular/router';
import {ProdutoService} from "../../shared/services/produto.service";

@Component({
  selector: 'app-listagem-produto',
  templateUrl: './listagem-produto.component.html',
  styleUrls: ['./listagem-produto.component.scss']
})
export class ListagemProdutoComponent implements OnInit {

  produtos: Array<Produto>;

  constructor(private produtoService: ProdutoService, private roteador: Router) { }

  ngOnInit(): void {
    this.produtoService.listar().subscribe(
      produtos => this.produtos = produtos
    );
  }

  editar(produto: Produto): void {
    this.roteador.navigate(['cadastrarproduto', produto.id]);
  }

  remover(produto: Produto): void {
    this.produtoService.remover(produto.id).subscribe(
      resposta => {
        const indxProdutoARemover = this.produtos.findIndex(p => p.id === produto.id);
        if (indxProdutoARemover > -1) {
          this.produtos.splice(indxProdutoARemover, 1);
        }
      }
    );
  }
}
