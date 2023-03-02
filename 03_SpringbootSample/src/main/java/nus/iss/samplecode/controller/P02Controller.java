package nus.iss.samplecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// This Controller Simply Return template and subpage template

@Controller
@RequestMapping(path = "/page02")
// @RequestMapping(path = {"/page02" , "/pagetwo"})
public class P02Controller {

    // @GetMapping
    @GetMapping(value = "")
    public String showPage02(Model model) {
        return "page02";
        // return "page02.html"; //and dont do this ====> return "/page02";
    }

    @GetMapping(value = "/subpage")
    public String showSubPage(Model model) {
        return "page02sub";
    }
}
