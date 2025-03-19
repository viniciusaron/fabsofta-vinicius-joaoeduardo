package br.univille.entity;

import java.util.ArrayList;

public class Pessoa {
    // atributo (variável)
    private long id;
    private String nome; 
    private String endereco;

    private Cidade cidade;

    private ArrayList<Pokemon> listaPokemon = new ArrayList<Pokemon>();

    public ArrayList<Pokemon> getListaPokemon() {
        return listaPokemon;
    }
    public void setListaPokemon(ArrayList<Pokemon> listaPokemon){
        this.listaPokemon = listaPokemon;
    }

    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // construtor (mesmo nome da classe, não tem retorno)
    public Pessoa(String nome) {
        // this referencia a classe
        this.nome = nome;
    }
    // dois métodos com assinatura semelhante = polimorfismo
    public Pessoa() {
        
    }

    //método
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // sobreescrita de método (overwrite)
    @Override
    public String toString() {

        return getNome();
    }
  
}
