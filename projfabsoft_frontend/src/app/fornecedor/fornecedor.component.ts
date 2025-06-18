import { Component } from '@angular/core';
import { Fornecedor } from '../model/fornecedor';
import { FornecedorService } from '../service/fornecedor.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-fornecedor',
  imports: [HttpClientModule, CommonModule, RouterLink],
  templateUrl: './fornecedor.component.html',
  styleUrl: './fornecedor.component.css',
  providers: [FornecedorService]
})
export class FornecedorComponent {

    public listaFornecedores:Fornecedor[] = [];
    
    constructor(
      private fornecedorService:FornecedorService
    ){}

    ngOnInit(): void {
      this.fornecedorService.getClientes().subscribe(resposta => {
          this.listaFornecedores = resposta;
      })
    }
}
