import { Component, ElementRef, ViewChild, OnInit } from '@angular/core';
import { Estoque } from '../model/estoque';
import { EstoqueService } from '../service/estoque.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import * as bootstrap from 'bootstrap';

@Component({
  selector: 'app-estoque',
  imports: [HttpClientModule, CommonModule],
  templateUrl: './estoque.component.html',
  styleUrl: './estoque.component.css',
  providers: [EstoqueService, Router]
})

export class EstoqueComponent implements OnInit {

  public listaEstoque:Estoque[] = [];

  @ViewChild('myModal') modalElement!: ElementRef;
  private modal!: bootstrap.Modal;

  private estoqueSelecionado!: Estoque;
  
  constructor(
    private estoqueService:EstoqueService,
    private router:Router
  ){}

  ngOnInit(): void{
    this.estoqueService.getEstoque().subscribe(resposta => {
      this.listaEstoque = resposta;
    })
  }
  novo(){
    this.router.navigate(['estoque/novo']);
  }
  alterar(estoque:Estoque){
      this.router.navigate(['estoque/alterar', estoque.id]);
  }

  visualizar(estoque:Estoque){
    this.router.navigate(['produtos']);
  }

  abrirConfirmacao(estoque:Estoque) {
    this.estoqueSelecionado = estoque;
    this.modal = new bootstrap.Modal(this.modalElement.nativeElement);
    this.modal.show();
  }

  fecharConfirmacao() {
    this.modal.hide();
  }

  confirmarExclusao() {
    this.estoqueService.excluirEstoque(this.estoqueSelecionado.id).subscribe(
        () => {
            this.fecharConfirmacao();
            this.estoqueService.getEstoque().subscribe(
              estoque => {
                this.listaEstoque = estoque;
              }
            );
        },
        error => {
            console.error('Erro ao excluir estoque:', error);
        }
    );
  }
}