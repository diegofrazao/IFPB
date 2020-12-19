import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CadastrarClienteComponent } from './cadastrar-cliente/cadastrar-cliente.component';
import { ListagemClienteComponent } from './listagem-cliente/listagem-cliente.component'
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {RouterModule} from '@angular/router';
import {FormsModule} from '@angular/forms';
import {MatCardModule} from '@angular/material/card';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {FlexLayoutModule} from '@angular/flex-layout';
import {FirestoreModule} from "../firestore/firestore.module";
import {PipesModule} from "../shared/pipes/pipes.module";
import {AppModule} from "../app.module";

@NgModule({
  declarations: [CadastrarClienteComponent, ListagemClienteComponent],
  exports: [
    CadastrarClienteComponent,
    ListagemClienteComponent
  ],
  imports: [
    BrowserAnimationsModule,
    RouterModule,
    CommonModule,
    MatInputModule,
    MatFormFieldModule,
    FormsModule,
    MatCardModule,
    MatIconModule,
    MatButtonModule,
    FlexLayoutModule,
    FirestoreModule,
    PipesModule
  ]
})
export class ClienteModule { }
