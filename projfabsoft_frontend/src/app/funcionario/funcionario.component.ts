import { Component, ElementRef, ViewChild } from '@angular/core';
import { Funcionario } from '../model/funcionario';
import { FuncionarioService } from '../service/funcionario.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';
import * as bootstrap from 'bootstrap';

@Component({
  selector: 'app-funcionario',
  imports: [HttpClientModule, CommonModule],
  templateUrl: './funcionario.component.html',
  styleUrl: './funcionario.component.css',
  providers: [FuncionarioService, Router]
})
export class FuncionarioComponent {

  public listaFuncionarios:Funcionario[] = [];

  @ViewChild('myModal') modalElement!: ElementRef;
  private modal!: bootstrap.Modal;

  private funcionarioSelecionado!: Funcionario;
  
  constructor(
    private funcionarioService:FuncionarioService,
    private router:Router
  ){}

  ngOnInit(): void{
    this.funcionarioService.getFuncionarios().subscribe(resposta => {
      this.listaFuncionarios = resposta;
    })
  }
  novo(){
    this.router.navigate(['funcionarios/novo']);
  }
  alterar(funcionario:Funcionario){
    this.router.navigate(['funcionarios/alterar', funcionario.id]);
  }

  abrirConfirmacao(funcionario:Funcionario) {
    this.funcionarioSelecionado = funcionario;
    this.modal = new bootstrap.Modal(this.modalElement.nativeElement);
    this.modal.show();
  }

  fecharConfirmacao() {
    this.modal.hide();
  }

  confirmarExclusao() {
    this.funcionarioService.excluirFuncionario(this.funcionarioSelecionado.id).subscribe(
        () => {
            this.fecharConfirmacao();
            this.funcionarioService.getFuncionarios().subscribe(
              funcionarios => {
                this.listaFuncionarios = funcionarios;
              }
            );
        },
        error => {
            console.error('Erro ao excluir funcionário:', error);
        }
    );
  }

}
