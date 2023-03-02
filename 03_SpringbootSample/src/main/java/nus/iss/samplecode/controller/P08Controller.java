package nus.iss.samplecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/page08")
public class P08Controller {

    @GetMapping(value = "")
    public String getEmpty(Model model){
        return "page08";
    }

    @PostMapping(value = "/post")
    public String getRequest(@RequestBody MultiValueMap<String,String> form , Model model){
        //Alternative Method is using @ModelAttribute as demo by daryl 
        String name = form.getFirst("name");
        String email = form.getFirst("email");
        String age = form.getFirst("age");

        model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("age", age);

        return "page08";
    }
    
}
