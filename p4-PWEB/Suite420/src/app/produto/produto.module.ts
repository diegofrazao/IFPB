import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CadastrarProdutoComponent } from './cadastrar-produto/cadastrar-produto.component';
import { ListagemProdutoComponent } from './listagem-produto/listagem-produto.component';
import {MatCardModule} from '@angular/material/card';
import {MatButtonModule} from '@angular/material/button';
import {FlexLayoutModule} from '@angular/flex-layout';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule} from '@angular/forms';
import {MatIconModule} from '@angular/material/icon';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {RouterModule} from '@angular/router';
import {FirestoreModule} from "../firestore/firestore.module";



@NgModule({
  declarations: [CadastrarProdutoComponent, ListagemProdutoComponent],
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
    FirestoreModule
  ]
})
export class ProdutoModule { }
