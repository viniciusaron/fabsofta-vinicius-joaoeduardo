import { Component, ElementRef, ViewChild } from '@angular/core';
import { Fornecedor } from '../model/fornecedor';
import { FornecedorService } from '../service/fornecedor.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import * as bootstrap from 'bootstrap';

@Component({
  selector: 'app-fornecedor',
  imports: [HttpClientModule, CommonModule],
  templateUrl: './fornecedor.component.html',
  styleUrl: './fornecedor.component.css',
  providers: [FornecedorService, Router]
})
export class FornecedorComponent {

  public listaFornecedores:Fornecedor[] = [];

  @ViewChild('myModal') modalElement!: ElementRef;
  private modal!: bootstrap.Modal;

  private fornecedorSelecionado!: Fornecedor;
  
  constructor(
    private fornecedorService:FornecedorService,
    private router:Router
  ){}

  ngOnInit(): void{
    this.fornecedorService.getFornecedores().subscribe(resposta => {
      this.listaFornecedores = resposta;
    })
  }
  novo(){
    this.router.navigate(['fornecedores/novo']);
  }
  alterar(fornecedor:Fornecedor){
    this.router.navigate(['fornecedores/alterar', fornecedor.id]);
  }

  abrirConfirmacao(fornecedor:Fornecedor) {
    this.fornecedorSelecionado = fornecedor;
    this.modal = new bootstrap.Modal(this.modalElement.nativeElement);
    this.modal.show();
  }

  fecharConfirmacao() {
    this.modal.hide();
  }

  confirmarExclusao() {
    this.fornecedorService.excluirFornecedor(this.fornecedorSelecionado.id).subscribe(
        () => {
            this.fecharConfirmacao();
            this.fornecedorService.getFornecedores().subscribe(
              fornecedores => {
                this.listaFornecedores = fornecedores;
              }
            );
        },
        error => {
            console.error('Erro ao excluir fornecedor:', error);
        }
    );
  }

}
