import { Component } from '@angular/core';
import { Funcionario } from '../model/funcionario';
import { FuncionarioService } from '../service/funcionario.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-funcionario',
  imports: [HttpClientModule, CommonModule],
  templateUrl: './funcionario.component.html',
  styleUrl: './funcionario.component.css',
  providers: [FuncionarioService, Router]
})
export class FuncionarioComponent {

  public listaFuncionarios:Funcionario[] = [];
  
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
}
