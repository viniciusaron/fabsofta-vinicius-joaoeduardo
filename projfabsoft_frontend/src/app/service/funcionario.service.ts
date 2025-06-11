import { Injectable } from '@angular/core';
import { Funcionario } from '../model/funcionario';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class FuncionarioService {
  apiURL = "http://localhost:8080/api/v1/funcionarios";

  constructor(private http:HttpClient) { }

  getFuncionarios(){
    return this.http.get<Funcionario[]>(this.apiURL);
  }
  saveFuncionario(funcionario:Funcionario){
    if(funcionario.id){
      return this.http.put(this.apiURL + '/' + funcionario.id, funcionario);
    }
    return this.http.post(this.apiURL,funcionario);
  }
  getFuncionarioById(id: any) {
    return this.http.get<Funcionario>(this.apiURL + '/' + id);
  }
}
