package nus.iss.pokedex.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import nus.iss.pokedex.model.Pokemon;

@Repository
public class PokemonRepo {
    private List<Pokemon> pokemons;
    Pokemon pkm;


    public PokemonRepo(){
        if(pokemons == null){
            pokemons = new ArrayList<Pokemon>();
        }

        pkm = new Pokemon(1,"Balbasaur", 3000);
        pokemons.add(pkm);
        pkm = new Pokemon(2,"Ivysaur", 4000);
        pokemons.add(pkm);
        pkm = new Pokemon(3,"Venusaur", 5500);
        pokemons.add(pkm);
    }

    public List<Pokemon> findAll(){
        return pokemons;
    }

    public Boolean save(Pokemon pokemon) {
        Boolean result = pokemons.add(pokemon);
        return result;
    }

    
}
