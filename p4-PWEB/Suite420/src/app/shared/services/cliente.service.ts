import { Injectable } from '@angular/core';
import {Cliente} from '../model/cliente';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {
  URL_CLIENTES = 'http://localhost:8080/clientes';

  constructor(private httpClient: HttpClient) {
  }

  listar(): Observable<Cliente[]> {
    return this.httpClient.get<Cliente[]>(this.URL_CLIENTES);
  }

  inserir(cliente: Cliente): Observable<Cliente> {
    return this.httpClient.post<Cliente>(this.URL_CLIENTES, cliente);
  }

  atualizar(cliente: Cliente): Observable<Cliente>{
    return this.httpClient.put<Cliente>(`${this.URL_CLIENTES}/${cliente.id}`, cliente);
  }

  remover(id: number): Observable<object> {
    return this.httpClient.delete(`${this.URL_CLIENTES}/${id}`);
  }

  pesquisarId(id: number): Observable<Cliente> {
    return this.httpClient.get<Cliente>(`${this.URL_CLIENTES}/${id}`);
  }
}
