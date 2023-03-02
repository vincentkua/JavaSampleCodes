package nus.iss.pizzaapp.controllers;

import java.io.StringReader;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import nus.iss.pizzaapp.services.PizzaService;

@RestController
@RequestMapping(path = "/order")
public class PizzaRestController {

    @Autowired
    private PizzaService pizzaSvc;

    @GetMapping(path = "{orderID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getOrder(@PathVariable String orderID) {
        String opt = pizzaSvc.getOrderByOrderId(orderID);
        System.out.println("###########################");
        System.out.println("JSONString:" + opt);

        if (opt == null) {
            JsonObject resp = Json.createObjectBuilder()
                    .add("message", "Order %s not found".formatted(orderID))
                    .build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(resp.toString());
        } else {
            JsonReader reader = Json.createReader(new StringReader(opt));
            JsonObject json = reader.readObject();
            return ResponseEntity.status(HttpStatus.OK)
                    .body(json.toString());
        }

    }
}
