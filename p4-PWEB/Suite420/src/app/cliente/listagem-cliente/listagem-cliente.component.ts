import { Component, OnInit } from '@angular/core';
import {Cliente} from '../../shared/model/cliente';
import {Router} from '@angular/router';
import {ClienteService} from "../../shared/services/cliente.service";

@Component({
  selector: 'app-listagem-cliente',
  templateUrl: './listagem-cliente.component.html',
  styleUrls: ['./listagem-cliente.component.scss']
})
export class ListagemClienteComponent implements OnInit {

  clientes: Array<Cliente>;

  constructor(private clienteService: ClienteService, private roteador: Router) { }

  ngOnInit(): void {
    this.clienteService.listar().subscribe(
      clientes => this.clientes = clientes
    );
  }
  editar(cliente: Cliente): void {
    this.roteador.navigate(['cadastrarcliente', cliente.id]);
  }

  remover(cliente: Cliente): void {
    this.clienteService.remover(cliente.id).subscribe(
      resposta => {
        const indxClienteARemover = this.clientes.findIndex(c => c.cpf === cliente.cpf);
        if (indxClienteARemover > -1) {
          this.clientes.splice(indxClienteARemover, 1);
        }
      }
    );
  }
}
