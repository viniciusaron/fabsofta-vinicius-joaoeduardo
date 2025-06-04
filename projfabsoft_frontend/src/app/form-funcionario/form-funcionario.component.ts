import { Component } from '@angular/core';
import { Funcionario } from '../model/funcionario';
import { FuncionarioService } from '../service/funcionario.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-funcionario',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-funcionario.component.html',
  styleUrl: './form-funcionario.component.css',
  providers: [FuncionarioService, Router]
})
export class FormFuncionarioComponent {
    funcionario:Funcionario = new Funcionario();

    constructor(
      private funcionarioService:FuncionarioService,
      private router:Router
    ){}

    salvar(){
      this.funcionarioService.saveFuncionario(this.funcionario)
          .subscribe( res => {
            this.router.navigate(['funcionarios']);
          });
    }
}
