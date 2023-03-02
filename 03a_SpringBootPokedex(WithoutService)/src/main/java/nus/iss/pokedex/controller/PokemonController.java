package nus.iss.pokedex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import nus.iss.pokedex.model.Pokemon;
import nus.iss.pokedex.repository.PokemonRepo;


@Controller
@RequestMapping(path = "/")
public class PokemonController {

    @Autowired
    PokemonRepo pokemonRepo;

    @GetMapping("/home")
    public String displayPokemon(Model model){
        List<Pokemon> pokemons = pokemonRepo.findAll();
        model.addAttribute("pokemons", pokemons);
        return "pokedex.html";
    }


    @GetMapping("/addnew")
    public String addPage(Model model){
        Pokemon pkm = new Pokemon();
        model.addAttribute("pokemon", pkm);
        return "pokemonAdd";
    }


    @PostMapping("/addnew")
    public String addPokemon(@Valid @ModelAttribute("pokemon") Pokemon pokemonForm, BindingResult result,
            Model model) {

        if (result.hasErrors()) {
            return "pokemonAdd";
        }

        pokemonRepo.save(pokemonForm);

        return "redirect:/home";

    }





    
}
