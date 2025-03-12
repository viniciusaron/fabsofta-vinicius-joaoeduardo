package br.univille;
public class Pessoa {
    // Atributo (variável)
    private String nome; 

    // Construtor; mesmo nome da classe, não tem retorno
    public Pessoa(String nome) {
        this.nome = nome;
    }
    // Dois métodos com a assinatura semelhante = polimorfismo
    public Pessoa() {

    }

    //Método
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Sobreescrita de método (overwrite)
    @Override
    public String toString() {
        
        return super.toString() + getNome();
    }
}
