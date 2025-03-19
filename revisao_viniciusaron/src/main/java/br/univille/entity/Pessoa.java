package br.univille.entity;
public class Pessoa {
    // Atributo (variável)
    private long id;
    private String nome;
    private String endereco; 

    private Cidade cidade;

    public Pessoa(long id, String nome, String endereco, Cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
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
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
