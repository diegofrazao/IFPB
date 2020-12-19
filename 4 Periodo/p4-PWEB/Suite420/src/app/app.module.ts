import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {FormsModule} from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import {LayoutModule} from './layout/layout.module';
import {RouterModule} from '@angular/router';
import {ClienteModule} from './cliente/cliente.module';
import {MatIconModule} from '@angular/material/icon';
import {MatCardModule} from '@angular/material/card';
import {HttpClientModule} from '@angular/common/http';
import {ProdutoModule} from './produto/produto.module';
import {FirestoreModule} from "./firestore/firestore.module";
import {MatSnackBarModule} from "@angular/material/snack-bar";
import { CpfPipe } from './shared/pipes/cpf.pipe';

@NgModule({
    declarations: [
        AppComponent
    ],
    imports: [
        BrowserModule,
        RouterModule,
        AppRoutingModule,
        FormsModule,
        BrowserAnimationsModule,
        MatFormFieldModule,
        MatInputModule,
        MatButtonModule,
        LayoutModule,
        ClienteModule,
        MatIconModule,
        MatCardModule,
        HttpClientModule,
        ProdutoModule,
        MatSnackBarModule,
        FirestoreModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule { }
