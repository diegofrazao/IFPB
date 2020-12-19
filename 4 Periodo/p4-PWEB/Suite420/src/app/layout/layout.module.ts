import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MenuComponent } from './menu/menu.component';
import {MatMenuModule} from '@angular/material/menu';
import {MatCardModule} from '@angular/material/card';
import {MatIconModule} from '@angular/material/icon';
import {RouterModule} from '@angular/router';
import {AppRoutingModule} from '../app-routing.module';
import {MatButtonModule} from '@angular/material/button';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {FlexLayoutModule, FlexModule} from '@angular/flex-layout';
import {MatToolbarModule} from "@angular/material/toolbar";
import {MatBadgeModule} from "@angular/material/badge";

@NgModule({
    declarations: [MenuComponent],
    exports: [
        MenuComponent
    ],
    imports: [
      BrowserAnimationsModule,
      CommonModule,
      MatMenuModule,
      MatCardModule,
      MatIconModule,
      RouterModule,
      AppRoutingModule,
      MatButtonModule,
      FlexLayoutModule,
      FlexModule,
      MatToolbarModule,
      MatBadgeModule
    ]
})
export class LayoutModule { }
