package br.univille;
public class Pessoa {
    // atributo (variável)
    private String nome; 

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

        return super.toString() + getNome();
    }
}
