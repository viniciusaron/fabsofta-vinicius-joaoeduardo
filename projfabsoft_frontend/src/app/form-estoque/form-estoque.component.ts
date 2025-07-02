import { Component } from '@angular/core';
import { Estoque } from '../model/estoque';
import { EstoqueService } from '../service/estoque.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-form-estoque',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-estoque.component.html',
  styleUrl: './form-estoque.component.css',
  providers: [EstoqueService, Router]
})
export class FormEstoqueComponent {
    estoque:Estoque = new Estoque();

    constructor(
      private estoqueService:EstoqueService,
      private router:Router,
      private activeRouter: ActivatedRoute
    ){
        const id = this.activeRouter.snapshot.paramMap.get('id');

          if (id) {
           this.estoqueService.getEstoqueById(id).subscribe(estoque => {
            this.estoque = estoque;
          });
        }
    }
    
    salvar(){
      this.estoqueService.saveEstoque(this.estoque)
          .subscribe( res => {
            this.router.navigate(['estoque']);
          });
    }

    sair(){
      this.router.navigate(['estoque']);
    }
}
