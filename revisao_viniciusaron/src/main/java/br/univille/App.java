package br.univille;

import br.univille.entity.Cidade;
import br.univille.entity.Pessoa;
import br.univille.entity.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //instância = ato de você refêrenciar um objeto
        
        Cidade jlle = new Cidade();
        jlle.setNome("Joinville");
        jlle.setEstado("Santa Catarina");

        Pokemon porygon = new Pokemon("Porygon");
        Pokemon porygon2 = new Pokemon("Porygon2");

        Pessoa joaozinho = new Pessoa("joaozinho");
        Pessoa zezinho = new Pessoa();
        zezinho.setNome("Zezinho");
        zezinho.setCidade(jlle);
        zezinho.getListaPokemon().add(porygon);
        zezinho.getListaPokemon().add(porygon2);

        for (var umPokemon : zezinho.getListaPokemon()){
            System.out.println(umPokemon);
        }

        zezinho.getListaPokemon().stream().forEach(System.out::println);


        System.out.println(joaozinho);
        System.out.println(zezinho);
    }
    
}
