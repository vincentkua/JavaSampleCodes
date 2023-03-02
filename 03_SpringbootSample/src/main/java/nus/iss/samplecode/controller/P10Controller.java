package nus.iss.samplecode.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import nus.iss.samplecode.model.Pokemon;
import nus.iss.samplecode.repository.PokemonRepo;


@Controller
@RequestMapping(path = "/page10")
public class P10Controller {

    @Autowired
    PokemonRepo pokemonRepo;

    @GetMapping(value = "")
    public String displayPokemon(Model model){
        List<Pokemon> pokemons = pokemonRepo.findAll();
        model.addAttribute("pokemons", pokemons);
        return "page10";
    }

    @GetMapping(value = "/delete/{pokemonid}")
    public String deletePokemon(@PathVariable("pokemonid") String pokemonid, Model model){
        pokemonRepo.deletePokemon(pokemonid);
        List<Pokemon> pokemons = pokemonRepo.findAll();
        model.addAttribute("pokemons", pokemons);
        return "page10";
    }

    @PostMapping(value = "")
    public String addPokemon(@RequestBody MultiValueMap<String, String> form, Model model){
        String pokemonid = form.getFirst("pokemonid");
        String name = form.getFirst("name");
        pokemonRepo.addPokemon(pokemonid,name);
        List<Pokemon> pokemons = pokemonRepo.findAll();
        model.addAttribute("pokemons", pokemons);
        return "page10";
    }


    
}
