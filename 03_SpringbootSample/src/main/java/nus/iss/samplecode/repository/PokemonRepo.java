package nus.iss.samplecode.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import nus.iss.samplecode.model.Pokemon;



@Repository
public class PokemonRepo {
    private List<Pokemon> pokemons;
    Pokemon pkm;


    public PokemonRepo(){
        if(pokemons == null){
            pokemons = new ArrayList<Pokemon>();
        }

        pkm = new Pokemon("1","Balbasaur");
        pokemons.add(pkm);
        pkm = new Pokemon("2","Ivysaur");
        pokemons.add(pkm);
        pkm = new Pokemon("3","Venusaur");
        pokemons.add(pkm);

    }

    public List<Pokemon> findAll(){
        return pokemons;
    }

    public void addPokemon(String pokemonid, String name){
        pkm = new Pokemon(pokemonid, name);
        pokemons.add(pkm);
    }


    public void deletePokemon(String pokemonid){
        Pokemon emp = pokemons.stream().filter(e -> e.getPokemonid().equals(pokemonid)).findFirst().get();
        pokemons.remove(emp);
        // pokemons.remove();
    }
    



    
}
