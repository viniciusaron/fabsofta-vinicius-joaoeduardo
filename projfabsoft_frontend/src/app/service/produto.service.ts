import { Injectable } from '@angular/core';
import { Produto } from '../model/produto';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ProdutoService {
  apiURL = "http://localhost:8080/api/v1/produtos";

  constructor(private http:HttpClient) { }

  getProdutos(){
    return this.http.get<Produto[]>(this.apiURL);
  }
}