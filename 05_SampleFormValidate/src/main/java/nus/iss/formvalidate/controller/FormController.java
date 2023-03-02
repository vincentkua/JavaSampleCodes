package nus.iss.formvalidate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import nus.iss.formvalidate.model.Contact;

@Controller
@RequestMapping(path = "/form")
public class FormController {

    @GetMapping(value = "")
    public String getEmptyForm(Model model) {

        model.addAttribute("contact", new Contact());
        return "form";

    }

    @PostMapping(value = "")
    public String validateForm(@Valid Contact contact, BindingResult result, Model model) {
        if (result.hasErrors()){
            return "form";
        }

        System.out.println(contact);

        model.addAttribute("contact", contact);

        return "formok";

    }

}
