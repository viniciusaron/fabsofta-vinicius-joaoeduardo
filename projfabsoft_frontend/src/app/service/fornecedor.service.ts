import { Injectable } from '@angular/core';
import { Fornecedor } from '../model/fornecedor';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ClienteFornecedor {
  apiURL = "http://localhost:8080/api/v1/fornecedor";
  
  constructor(private http:HttpClient) { }

  getFornecedores(){
    return this.http.get<Fornecedor[]>(this.apiURL);
  }

}
