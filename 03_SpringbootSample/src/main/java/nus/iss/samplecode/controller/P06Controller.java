package nus.iss.samplecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/page06")
public class P06Controller {
    @GetMapping(value = "")
    public String getPage06(){

        return  "page06";
    }

    
    
}
