import { Injectable } from '@angular/core';
import { Estoque } from '../model/estoque';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EstoqueService {
  apiURL = "http://localhost:8080/api/v1/estoque";

  constructor(private http:HttpClient) { }

  getEstoque(){
    return this.http.get<Estoque[]>(this.apiURL);
  }
  saveEstoque(estoque:Estoque){
    if(estoque.id){
      return this.http.put(this.apiURL + '/' + estoque.id, estoque);
    }
    return this.http.post(this.apiURL, estoque);
  }
  getEstoqueById(id: any) {
    return this.http.get<Estoque>(this.apiURL + '/' + id);
  }
}