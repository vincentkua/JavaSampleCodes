package nus.iss.sampleredis.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import nus.iss.sampleredis.models.Contact;
import nus.iss.sampleredis.repositories.MyRepository;

@Controller
@RequestMapping(path = "")
public class MyController {

    @Autowired
    MyRepository myrepo;

    // opsForValue sample
    @GetMapping(value = "/opsValue")
    public String getPage2(Model model) {
        String testname = myrepo.getname();
        model.addAttribute("name", testname);

        return "opsValueSample";
    }

    @PostMapping(value = "/opsValue")
    public String getNamelist(@RequestBody MultiValueMap<String, String> form, Model model) {

        String name = form.getFirst("name");
        System.out.println(name);
        myrepo.addname(name);

        String testname = myrepo.getname();
        model.addAttribute("name", testname);

        return "opsValueSample";
    }

    // opsForList sample
    @GetMapping(value = "/opsList")
    public String getList(Model model) {
        List<String> fruits = myrepo.getopslist("fruit");
        model.addAttribute("fruits", fruits);

        return "opsListSample";
    }

    @PostMapping(value = "/opsList")
    public String postList(@RequestBody MultiValueMap<String, String> form, Model model) {

        String name = form.getFirst("fruit");
        myrepo.addopslist(name);

        List<String> fruits = myrepo.getopslist("fruit");
        model.addAttribute("fruits", fruits);

        return "opsListSample";
    }

    @GetMapping(value = "/opsList/rightpop")
    public String deletelast() {
        myrepo.deletelast();

        return "redirect:/opsList";
    }

    @GetMapping(value = "/opsList/delete/{index}")
    public String deletefruit(@PathVariable("index") Integer index) {
        myrepo.deletefruit(index);
        return "redirect:/opsList";
    }

    // opsForHash sample
    @GetMapping(value = "/opsHash")
    public String getHash(Model model) {
        Contact contact=  myrepo.getHash();
        model.addAttribute("contact", contact.toString());
        model.addAttribute("contactobj", contact);
        
        return "opsHashSample";
    }

    @PostMapping(value = "/opsHash")
    public String postHash(@RequestBody MultiValueMap<String, String> form, Model model) {
        String name = form.getFirst("name");
        String email = form.getFirst("email");
        String phone = form.getFirst("phone");
        myrepo.addHash(name,email,phone);

        Contact contact=  myrepo.getHash();
        model.addAttribute("contact", contact.toString());

        return "opsHashSample";
    }

}
