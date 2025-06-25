import { Injectable } from '@angular/core';
import { Fornecedor } from '../model/fornecedor';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class FornecedorService {
  apiURL = "http://localhost:8080/api/v1/fornecedores";

  constructor(private http:HttpClient) { }

  getFornecedores(){
    return this.http.get<Fornecedor[]>(this.apiURL);
  }
  saveFornecedor (fornecedor:Fornecedor){
    if(fornecedor.id){
      return this.http.put(this.apiURL + '/' + fornecedor.id, fornecedor);
    }
    return this.http.post(this.apiURL,fornecedor);
  }
  getFornecedorById(id: any) {
    return this.http.get<Fornecedor>(this.apiURL + '/' + id);
  }
  excluirFornecedor(id: any){
    return this.http.delete<Fornecedor>(this.apiURL + '/' + id);
  }
}
