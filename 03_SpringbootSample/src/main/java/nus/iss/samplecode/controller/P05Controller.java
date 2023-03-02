package nus.iss.samplecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// This Page use redirect which will redirect to page6

@Controller
@RequestMapping(path = "/page05")
public class P05Controller {

    @GetMapping(value = "")
    public String getPage5(Model model) {

        return "page05";
    }

    @GetMapping(value = "/test")
    public String getPage5b(Model model) {

        return "redirect:/page06";
    }

}
