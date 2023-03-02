package nus.iss.pokedex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nus.iss.pokedex.model.Pokemon;
import nus.iss.pokedex.repository.PokemonRepo;

@Service
public class PokemonService {
    @Autowired
    PokemonRepo pokemonRepo;

    public List<Pokemon> retrievePokemonList(){
        return pokemonRepo.findAll();
    }

    public Boolean save(Pokemon pokemon) {
        return pokemonRepo.save(pokemon);

    }
    
}
