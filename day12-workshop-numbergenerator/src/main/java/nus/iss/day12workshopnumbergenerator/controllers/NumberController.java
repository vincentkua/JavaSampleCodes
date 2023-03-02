package nus.iss.day12workshopnumbergenerator.controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/generate")
public class NumberController {

    @GetMapping(value = "")
    public String generateNumber(@RequestParam("number") String number, Model model) {
        try {
            Integer thenumber = Integer.parseInt(number);
            List<Integer> numberarray = new LinkedList<>();

            for (int i = 0; i < thenumber; i++) {
                Random ran = new Random();
                Integer myrandom = ran.nextInt(10); // Generate a random from 0-9
                numberarray.add(myrandom);
            }

            System.out.println(numberarray);

            model.addAttribute("numberarray", numberarray);

            return "generated";

        } catch (Exception e) {
            return "error";
        }

    }

}
