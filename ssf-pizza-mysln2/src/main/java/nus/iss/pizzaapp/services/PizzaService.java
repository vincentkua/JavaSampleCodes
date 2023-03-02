package nus.iss.pizzaapp.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nus.iss.pizzaapp.models.Delivery;
import nus.iss.pizzaapp.models.Order;
import nus.iss.pizzaapp.models.Pizza;
import nus.iss.pizzaapp.repositories.PizzaRepository;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepo;

    public Order savePizzaOrder(Pizza pizza, Delivery delivery) {
        System.out.println("################################");
        // System.out.println(pizza.getPizza());
        String orderId = UUID.randomUUID().toString().substring(0, 8);
        String pizzatype = pizza.getPizza();
        String size = pizza.getSize();
        int quantity = pizza.getQuantity();
        String name = delivery.getName();
        String address = delivery.getAddress();
        String phone = delivery.getPhone();
        Boolean rush = delivery.isRush();
        String comments = delivery.getComments();
        float pizzacost = 100f;
        float total = 102f;
        Order order = new Order(orderId,pizzatype,size,quantity,name,address,phone,rush,comments,pizzacost,total);

        System.out.println("JSON File Generated... to be stored in redis...");
        System.out.println(order.toJSON());
     
        // calculateCost(order);
        pizzaRepo.save(order);
        return order;
    }

    public String getOrderByOrderId (String orderID) {

        String jsonstring = pizzaRepo.getJSONStringByID(orderID);

        return jsonstring;

    }



    // public void calculateCost(Order order) {

    //     System.out.println(order.getPizza());
  

    // }

}
