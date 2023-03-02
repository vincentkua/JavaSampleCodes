package nus.iss.samplecode.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//This Controller Going to return a object for html to display for each item

@Controller
@RequestMapping(path = "/page04")
public class P04Controller {
    
    @GetMapping(value = "")
    public String showpage04(Model model){
        List<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("papaya");
        model.addAttribute("fruits", fruits);

        return "page04";
    }
    
}
