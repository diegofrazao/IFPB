import { Injectable } from '@angular/core';
import {HttpErrorResponse, HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from "@angular/common/http";
import {catchError, tap} from "rxjs/operators";
import {Observable, throwError} from "rxjs";
import {MensagemService} from "../shared/services/mensagem.service";

@Injectable()
export class ErroInterceptor implements HttpInterceptor{

  constructor(private mensagemService: MensagemService) {
  }

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    return next.handle(request).pipe(
      tap((evento: HttpEvent<any>) => { }),
      catchError(resposta => this.processarErroResposta(resposta)));
  }

  processarErroResposta(response: Object): Observable<HttpEvent<any>> {
    if (response instanceof HttpErrorResponse && response.status !== 401) {
      this.mensagemService.error(response.message);
    }

    return throwError(response);
  }
}
