import { Component } from '@angular/core';
import { Produto } from '../model/produto';
import { ProdutoService } from '../service/produto.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-funcionario',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-produto.component.html',
  styleUrl: './form-produto.component.css',
  providers: [ProdutoService, Router]
})
export class FormProdutoComponent {
    produto:Produto = new Produto();

    constructor(
      private produtoService:ProdutoService,
      private router:Router
    ){}

    salvar(){
      this.produtoService.saveProdutos(this.produto)
          .subscribe( res => {
            this.router.navigate(['produtos']);
          });
    }
}
