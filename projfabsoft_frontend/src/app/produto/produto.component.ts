import { Component, ElementRef, ViewChild, OnInit } from '@angular/core';
import { Produto } from '../model/produto';
import { ProdutoService } from '../service/produto.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { Router, ActivatedRoute, RouterModule } from '@angular/router';
import * as bootstrap from 'bootstrap';

@Component({
  selector: 'app-produto',
  imports: [HttpClientModule, CommonModule, RouterModule],
  templateUrl: './produto.component.html',
  styleUrl: './produto.component.css',
  providers: [ProdutoService, Router]
})
export class ProdutoComponent implements OnInit {

  public listaProdutos:Produto[] = [];
  public produtoEspecifico: Produto | null = null;
  public mostrarProdutoEspecifico = false;

  @ViewChild('myModal') modalElement!: ElementRef;
  private modal!: bootstrap.Modal;

  private produtoSelecionado!: Produto;
  
  constructor(
    private produtoService:ProdutoService,
    private router:Router,
    private route: ActivatedRoute
  ){}

  ngOnInit(): void{
    // Verifica se há um ID na rota
    const id = this.route.snapshot.paramMap.get('id');
    
    if (id) {
      // Se há ID, busca o produto específico
      this.produtoService.getProdutosById(id).subscribe(produto => {
        this.produtoEspecifico = produto;
        this.mostrarProdutoEspecifico = true;
      });
    } else {
      // Se não há ID, carrega todos os produtos
      this.produtoService.getProdutos().subscribe(resposta => {
        this.listaProdutos = resposta;
        this.mostrarProdutoEspecifico = false;
      });
    }
  }
  
  novo(){
    this.router.navigate(['produtos/novo']);
  }
  
  alterar(produto:Produto){
      this.router.navigate(['produtos/alterar', produto.id]);
    }

  abrirConfirmacao(produto:Produto) {
    this.produtoSelecionado = produto;
    this.modal = new bootstrap.Modal(this.modalElement.nativeElement);
    this.modal.show();
  }

  fecharConfirmacao() {
    this.modal.hide();
  }

  confirmarExclusao() {
    this.produtoService.excluirProduto(this.produtoSelecionado.id).subscribe(
        () => {
            this.fecharConfirmacao();
            this.produtoService.getProdutos().subscribe(
              produtos => {
                this.listaProdutos = produtos;
              }
            );
        },
        error => {
            console.error('Erro ao excluir produto:', error);
        }
    );
  }

  voltarParaLista() {
    this.router.navigate(['produtos']);
  }
}
