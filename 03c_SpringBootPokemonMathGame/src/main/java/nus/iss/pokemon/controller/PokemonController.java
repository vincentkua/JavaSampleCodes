package nus.iss.pokemon.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import nus.iss.pokemon.model.Pokemon;
import nus.iss.pokemon.repository.PlayerRepo;
import nus.iss.pokemon.repository.PokemonRepo;

@Controller
@RequestMapping(path = { "/", "/index.html" })
public class PokemonController {

    @Autowired
    PokemonRepo pokemonRepo;

    @Autowired
    PlayerRepo playerRepo;

    @GetMapping(value = "/game")
    public String home(Model model) {

        Random ran = new Random();
        Integer random1 = ran.nextInt(20);
        Integer random2 = ran.nextInt(20);
        Integer realanswer = random1 + random2;
        Integer fakeanswer = random1 + random2;
        String action1 = "correct";
        String action2 = "wrong";

        while(fakeanswer == realanswer){
            fakeanswer = ran.nextInt(30);
        }

        Integer answer1, answer2;

        Integer random01 = ran.nextInt(2);
        if (random01 == 0) {
            answer1 = realanswer;
            answer2 = fakeanswer;
            action1 = "correct";
            action2 = "wrong";
        } else {
            answer1 = fakeanswer;
            answer2 = realanswer;
            action1 = "wrong";
            action2 = "correct";
        }

        Integer pokemonid = playerRepo.playerScore() + 1;


        if (pokemonid > 151) {
            model.addAttribute("score", playerRepo.playerScore());
            return "youwin.html";
        } else {
            // Pokemon pkm = pokemonRepo.findByPokemonId(pokemonid);
            model.addAttribute("score", playerRepo.playerScore());
            model.addAttribute("pokemonid", pokemonid);
            // model.addAttribute("pokemon", pkm);
            model.addAttribute("random1", random1);
            model.addAttribute("random2", random2);
            model.addAttribute("answer1", answer1);
            model.addAttribute("answer2", answer2);
            model.addAttribute("action1", action1);
            model.addAttribute("action2", action2);


            return "pokemongame.html";
        }

    }

    @GetMapping(value = "/pokedex")
    public String pokedexpage(Model model) {
        List<Pokemon> pokemons = pokemonRepo.showAll();
        model.addAttribute("pokemons", pokemons);
        return "pokedex";
    }

    @GetMapping(value = "/reset")
    public String resetgame(Model model) {
        playerRepo.setScore(0);
        // return "resetdone.html";
        return "redirect:/game";
    }


    @GetMapping("/game/{result}")
    public String delEmployee(@PathVariable("result") String result ,Model model){

        if (result.equals("correct")){
            playerRepo.correct();
            return "redirect:/game";
        }else{
            // playerRepo.wrong();
            model.addAttribute("score", playerRepo.playerScore());
            return "youlose";


        }



    }

};
