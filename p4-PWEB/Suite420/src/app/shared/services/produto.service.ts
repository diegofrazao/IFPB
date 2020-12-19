import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Produto} from '../model/produto';

@Injectable({
  providedIn: 'root'
})
export class ProdutoService {

  URL_PRODUTOS = 'http://localhost:8080/produtos';

  constructor(private httpClient: HttpClient) { }

  listar(): Observable<Produto[]> {
    return this.httpClient.get<Produto[]>(this.URL_PRODUTOS);
  }

  inserir(produto: Produto): Observable<Produto> {
    return this.httpClient.post<Produto>(this.URL_PRODUTOS, produto);
  }

  atualizar(produto: Produto): Observable<Produto>{
    return this.httpClient.put<Produto>(`${this.URL_PRODUTOS}/${produto.id}`, produto);
  }

  remover(id: number): Observable<object> {
    return this.httpClient.delete(`${this.URL_PRODUTOS}/${id}`);
  }

  pesquisarId(id: number): Observable<Produto> {
    return this.httpClient.get<Produto>(`${this.URL_PRODUTOS}/${id}`);
  }
}
