package nus.iss.samplecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// This Controller return with a template page and added with model attribute

@Controller
@RequestMapping(path = "/page03")
public class P03Controller {

    @GetMapping(value = "")
    public String showPage03(Model model) {

        model.addAttribute("attr", "Lorem Text From Controller");

        return "page03";

    }

}

