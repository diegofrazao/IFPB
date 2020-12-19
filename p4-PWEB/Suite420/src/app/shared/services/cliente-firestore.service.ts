import { Injectable } from '@angular/core';
import {AngularFirestore, AngularFirestoreCollection} from "@angular/fire/firestore";
import {Cliente} from "../model/cliente";
import {from, Observable} from "rxjs";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class ClienteFirestoreService {

  // colecaoClientes: AngularFirestoreCollection<Cliente>;
  // NOME_COLECAO = 'clientes';
  //
  // constructor(private afs: AngularFirestore) {
  //   this.colecaoClientes = afs.collection(this.NOME_COLECAO);
  // }
  //
  // listar(): Observable<Cliente[]> {
  //   return this.colecaoClientes.valueChanges({idField: 'id'});
  // }
  //
  // inserir(cliente: Cliente): Observable<Cliente> {
  //   delete cliente.id;
  //   return from(this.colecaoClientes.add(Object.assign({}, cliente)));
  // }
  //
  // remover(id: string): Observable<void> {
  //   return from(this.colecaoClientes.doc(id).delete());
  // }
  //
  // pesquisarPorId(id: string): Observable<Cliente> {
  //   return this.colecaoClientes.doc(id).get().pipe(map(document => new Cliente(document.id, document.data())));
  // }
  //
  // atualizar(cliente: Cliente): Observable<void> {
  //   delete cliente.id;
  //   return from(this.colecaoClientes.doc(cliente.id).update(Object.assign({}, cliente)));
  // }
  //
  // listarMaioresDeIdade(): Observable<Usuario[]> {
  //   let usuariosMaioresIdade: AngularFirestoreCollection<Usuario>;
  //   // fazendo pesquisas usando o where. Um where pode ser encadeado com outro
  //   usuariosMaioresIdade = this.afs.collection(this.NOME_COLECAO, ref => ref.where('idade', '>', '17'));
  //   return usuariosMaioresIdade.valueChanges();
  // }
  // }
}
