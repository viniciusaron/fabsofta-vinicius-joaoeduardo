package br.univille;

import br.univille.entity.Cidade;
import br.univille.entity.Pessoa;
import br.univille.entity.Pokemon;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        //Instância
        Cidade jlle = new Cidade();
        jlle.setNome("Joinville");
        jlle.setEstado("Santa Catarina");

        Pokemon jigglypuff = new Pokemon("JigglyPuff");
        Pokemon porygon = new Pokemon("Porygon");

        Pessoa fulano = new Pessoa("fulano");
        Pessoa zezinho = new Pessoa();
        zezinho.setNome("Zezinho");
        zezinho.setCidade(jlle);
        zezinho.getListaPokemon().add(jigglypuff);
        zezinho.getListaPokemon().add(porygon);

        for(int i=0; i<zezinho.getListaPokemon().size(); i++){
            System.out.println(zezinho.getListaPokemon().get(i));
        }

        for(var umPokemon : zezinho.getListaPokemon()){
            System.out.println(umPokemon);
        }
        
        zezinho.getListaPokemon().stream().forEach(System.out::println);

        System.out.println(fulano);
        System.out.println(zezinho);    

    }
}
