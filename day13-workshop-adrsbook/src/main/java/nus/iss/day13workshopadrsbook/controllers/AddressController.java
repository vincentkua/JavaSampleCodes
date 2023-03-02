package nus.iss.day13workshopadrsbook.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;
import nus.iss.day13workshopadrsbook.model.Contact;
import nus.iss.day13workshopadrsbook.repository.ContactRepo;

@Controller
@RequestMapping(path = "")
public class AddressController {
    @Autowired
    ContactRepo contRepo;

    // @GetMapping(value = "/page2")
    // public String showPage2(){
    // return "page2";
    // }

    @GetMapping(value = "/getall")
    public String showAllContact(Model model) {
        List<Contact> contacts = contRepo.findAll();
        System.out.println(contacts);
        model.addAttribute("contacts", contacts);
        return "all";
    }

    @GetMapping(value = "/add")
    public String showAddPage(Model model) {
        Contact cont = new Contact();
        model.addAttribute("contact", cont);
        return "add";
    }

    @PostMapping(value = "add")
    public String showAdd2(@Valid @ModelAttribute("contact") Contact contactForm, BindingResult result, Model model) {
        Contact cont = new Contact();
        model.addAttribute("contact", cont);

        if (result.hasErrors()) {
            return "add";
        } else {
            contRepo.addContact(contactForm);
            return "redirect:/getall";
        }

    }

}
