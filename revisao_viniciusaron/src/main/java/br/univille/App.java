package br.univille;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        Pessoa joaozinho = new Pessoa("joaozinho"); //instância = ato de você refêrenciar um objeto
        Pessoa zezinho = new Pessoa();
        zezinho.setNome("Zezinho");

        System.out.println(joaozinho);
        System.out.println(zezinho);
    }
}
