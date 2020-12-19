import { Injectable } from '@angular/core';
import {AngularFirestore, AngularFirestoreCollection} from "@angular/fire/firestore";
import {from, Observable} from "rxjs";
import {map} from "rxjs/operators";
import {Produto} from "../model/produto";

@Injectable({
  providedIn: 'root'
})
export class ProdutoFirestoreService {

  // colecaoProdutos: AngularFirestoreCollection<Produto>;
  // NOME_COLECAO = 'produtos';
  //
  // constructor(private afs: AngularFirestore) {
  //   this.colecaoProdutos = afs.collection(this.NOME_COLECAO);
  // }
  //
  // listar(): Observable<Produto[]> {
  //   return this.colecaoProdutos.valueChanges({idField: 'id'});
  // }
  //
  // inserir(produto: Produto): Observable<Produto> {
  //   delete produto.id;
  //   return from(this.colecaoProdutos.add(Object.assign({}, produto)));
  // }
  //
  // remover(id: string): Observable<void> {
  //   return from(this.colecaoProdutos.doc(id).delete());
  // }
  //
  // pesquisarPorId(id: string): Observable<Produto> {
  //   return this.colecaoProdutos.doc(id).get().pipe(map(document => new Produto(document.id, document.data())));
  // }
  //
  // atualizar(produto: Produto): Observable<void> {
  //   delete produto.id;
  //   return from(this.colecaoProdutos.doc(produto.id).update(Object.assign({}, produto)));
  // }
}
