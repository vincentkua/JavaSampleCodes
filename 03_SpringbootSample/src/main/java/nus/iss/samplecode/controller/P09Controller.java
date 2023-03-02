package nus.iss.samplecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/page09")
public class P09Controller {

    @GetMapping(value = "")
    public String getEmpty(Model model){
        return "page09";
    }

    @GetMapping(value = "/get/{name}")
    public String getRequest(@PathVariable("name") String name , Model model){
        //Alternative Method is using @ModelAttribute as demo by daryl 

        model.addAttribute("name", name);
        return "page09";
    }
    
}
