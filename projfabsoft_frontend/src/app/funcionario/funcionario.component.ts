import { Component } from '@angular/core';
import { Funcionario } from '../model/funcionario';
import { FuncionarioService } from '../service/funcionario.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-funcionario',
  imports: [HttpClientModule, CommonModule, RouterLink],
  templateUrl: './funcionario.component.html',
  styleUrl: './funcionario.component.css',
  providers: [FuncionarioService]
})
export class FuncionarioComponent {

  public listaFuncionarios:Funcionario[] = [];
  
  constructor(
    private funcionarioService:FuncionarioService
  ){}

  ngOnInit(): void{
    this.funcionarioService.getFuncionarios().subscribe(resposta => {
      this.listaFuncionarios = resposta;
    })
  }
}
