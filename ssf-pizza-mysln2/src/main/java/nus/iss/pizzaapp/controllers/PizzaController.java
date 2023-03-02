package nus.iss.pizzaapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import nus.iss.pizzaapp.models.Delivery;
import nus.iss.pizzaapp.models.Order;
import nus.iss.pizzaapp.models.Pizza;
import nus.iss.pizzaapp.services.PizzaService;

@Controller
@RequestMapping(path = "")
public class PizzaController {

    @Autowired
    private PizzaService pizzaSvc;

    @GetMapping(value = "")
    public String getView0(Model model, HttpSession sess) {
        sess.invalidate();
        model.addAttribute("pizza", new Pizza());
        return "index";
    }

    @PostMapping(value = "/pizza")
    public String checkOrder(Model model, HttpSession sess, @Valid Pizza pizza, BindingResult bindings) {

        System.out.println(pizza);

        if (bindings.hasErrors())
            return "index";

        sess.setAttribute("pizza", pizza);

        // if checked and okay...
        model.addAttribute("delivery", new Delivery());

        return "delivery";
    }

    @PostMapping(value = "/pizza/order")
    public String postOrder(Model model, HttpSession sess, @Valid Delivery delivery, BindingResult bindings) {
        System.out.println(delivery);

        if (bindings.hasErrors())
            return "delivery";

        Pizza pizza = (Pizza) sess.getAttribute("pizza");
        
        Order order = pizzaSvc.savePizzaOrder(pizza, delivery);


        model.addAttribute("order", order);

        // assume all okay....
        return "order";
    }

}
