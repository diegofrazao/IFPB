import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {CadastrarClienteComponent} from './cliente/cadastrar-cliente/cadastrar-cliente.component';
import {ListagemClienteComponent} from './cliente/listagem-cliente/listagem-cliente.component';
import {ListagemProdutoComponent} from './produto/listagem-produto/listagem-produto.component';
import {CadastrarProdutoComponent} from './produto/cadastrar-produto/cadastrar-produto.component';

const routes: Routes = [

  {
    path: '',
    component: ListagemClienteComponent
  },
  {
    path: 'cadastrarcliente',
    component: CadastrarClienteComponent
  },
  {
    path: 'cadastrarcliente/:id',
    component: CadastrarClienteComponent
  },
  {
    path: 'listagemcliente',
    component: ListagemClienteComponent
  },
  {
    path: 'cadastrarproduto',
    component: CadastrarProdutoComponent
  },
  {
    path: 'cadastrarproduto/:id',
    component: CadastrarProdutoComponent
  },
  {
    path: 'listagemproduto',
    component: ListagemProdutoComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
