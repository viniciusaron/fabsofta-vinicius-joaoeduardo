package br.univille;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //Instância
        Pessoa fulano = new Pessoa("fulano");
        Pessoa zezinho = new Pessoa();
        zezinho.setNome("Zezinho");

        System.out.println(fulano);
        System.out.println(zezinho);    


    }
}
