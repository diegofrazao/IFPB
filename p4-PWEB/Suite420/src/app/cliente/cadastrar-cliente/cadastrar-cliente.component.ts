import { Component, OnInit } from '@angular/core';
import {Cliente} from '../../shared/model/cliente';
import {ActivatedRoute, Router} from '@angular/router';
import {MensagemService} from "../../shared/services/mensagem.service";
import {ClienteService} from "../../shared/services/cliente.service";

@Component({
  selector: 'app-cadastrar-cliente',
  templateUrl: './cadastrar-cliente.component.html',
  styleUrls: ['./cadastrar-cliente.component.scss']
})
export class CadastrarClienteComponent implements OnInit {
  cliente: Cliente;
  operacaoCadastro = true;

  constructor(private clienteService: ClienteService, private rotaAtual: ActivatedRoute, private roteador: Router,
              private mensagemService: MensagemService) {
    this.cliente = new Cliente();
    if(this.rotaAtual.snapshot.paramMap.has('id')){
      this.operacaoCadastro = false;
      const idEdit = Number(this.rotaAtual.snapshot.paramMap.get('id'));
      this.clienteService.pesquisarId(idEdit).subscribe(
        clienteRetornado => this.cliente = clienteRetornado
      );
    }
  }

  ngOnInit(): void {
  }

  cadastrarCliente(): void {
    if (this.cliente.id) {
      this.clienteService.atualizar(this.cliente).subscribe(
        clienteAlterado => {
          this.mensagemService.success('Cliente alterado com sucesso!');
          this.roteador.navigate(['listagemcliente']);
        }
      );
    } else {
      this.clienteService.inserir(this.cliente).subscribe(
        clienteInserido => {
          this.mensagemService.success('Cliente inserido com sucesso!');
          this.roteador.navigate(['listagemcliente']);
        }
      );
    }
  }

}
