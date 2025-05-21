import { Component } from '@angular/core';
import { Funcionario } from '../model/funcionario';
import { FuncionarioService } from '../service/funcionario.service';

@Component({
  selector: 'app-funcionario',
  imports: [],
  templateUrl: './funcionario.component.html',
  styleUrl: './funcionario.component.css'
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
