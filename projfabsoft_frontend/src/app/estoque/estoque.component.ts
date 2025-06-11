import { Component } from '@angular/core';
import { Estoque } from '../model/estoque';
import { EstoqueService } from '../service/estoque.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-estoque',
  imports: [HttpClientModule, CommonModule, RouterLink],
  templateUrl: './estoque.component.html',
  styleUrl: './estoque.component.css',
  providers: [EstoqueService]
})
export class EstoqueComponent {

  public listaEstoque:Estoque[] = [];
  
  constructor(
    private estoqueService:EstoqueService
  ){}

  ngOnInit(): void{
    this.estoqueService.getEstoque().subscribe(resposta => {
      this.listaEstoque = resposta;
    })
  }
}
