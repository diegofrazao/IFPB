import { Component, OnInit } from '@angular/core';
import {ProdutoService} from "../../shared/services/produto.service";

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {

  constructor() {}

  ngOnInit(): void {
  }
}
