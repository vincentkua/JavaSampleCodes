package nus.iss.pokemon.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import nus.iss.pokemon.model.Pokemon;

@Repository
public class PokemonRepo {

    private List<Pokemon> pokemons;
    private Pokemon newpokemon;

    public PokemonRepo(){
        if(pokemons == null){
            pokemons = new ArrayList<Pokemon>();
        }

        newpokemon = new Pokemon(1,"Bulbasaur",20,5,2);
        pokemons.add(newpokemon);
        newpokemon = new Pokemon(2,"Ivysaur",20,5,2);
        pokemons.add(newpokemon);
        newpokemon = new Pokemon(3,"Venusaur",20,5,2);
        pokemons.add(newpokemon);
        newpokemon = new Pokemon(4,"Charmander",20,5,2);
        pokemons.add(newpokemon);
        newpokemon = new Pokemon(5,"Charmeleon",20,5,2);
        pokemons.add(newpokemon);
        newpokemon = new Pokemon(6,"Charizard",20,5,2);
        pokemons.add(newpokemon);
        newpokemon = new Pokemon(7,"Squirtle",20,5,2);
        pokemons.add(newpokemon);
        newpokemon = new Pokemon(8,"Wartortle",20,5,2);
        pokemons.add(newpokemon);
        newpokemon = new Pokemon(9,"Blastoise",20,5,2);
        pokemons.add(newpokemon);
     



    }

    public List<Pokemon> showAll(){
        return pokemons;
    }

    public Pokemon findByPokemonId(int id) {
        Pokemon pkn = pokemons.stream().filter(e -> e.getPokemonID()==id).findFirst().get();
        return pkn;
    }
    
}
