import { Component } from '@angular/core';
import { Fornecedor } from '../model/fornecedor';
import { FornecedorService } from '../service/fornecedor.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-form-fornecedor',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-fornecedor.component.html',
  styleUrl: './form-fornecedor.component.css',
  providers: [FornecedorService, Router]
})
export class FormFornecedorComponent {
    fornecedor:Fornecedor = new Fornecedor();

    constructor(
      private fornecedorService:FornecedorService,
      private router:Router,
      private activeRouter: ActivatedRoute
    ){
        const id = this.activeRouter.snapshot.paramMap.get('id');

        if (id) {
          this.fornecedorService.getFornecedorById(id).subscribe(fornecedor => {
            this.fornecedor = fornecedor;
          });
        }
    }

    salvar(){
      this.fornecedorService.saveFornecedor(this.fornecedor)
          .subscribe( res => {
            this.router.navigate(['fornecedores']);
          });
    }

    sair(){
      this.router.navigate(['fornecedores']);
    }
}
