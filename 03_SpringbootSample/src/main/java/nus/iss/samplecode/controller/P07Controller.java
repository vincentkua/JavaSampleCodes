package nus.iss.samplecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/page07")
public class P07Controller {

    @GetMapping(value = "")
    public String getEmpty(Model model){
        return "page07";
    }

    @GetMapping(value = "/get")
    public String getRequest(@RequestParam(name = "name") String name, @RequestParam(name = "email") String email, Model model){

        model.addAttribute("name", name);
        model.addAttribute("email", email);

        return "page07";
    }
    
}
