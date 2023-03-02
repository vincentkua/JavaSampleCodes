package nus.iss.pizzaapp.models;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Order {

    private String orderID;
    private String pizza;
    private String size;
    private int quantity;
    private String name;
    private String address;
    private String phone;
    private boolean rush = false;
    private String comments = "";
    private float pizzacost = 0f;
    private float total = 0f;


    public Order(String orderID, String pizza, String size, int quantity, String name, String address, String phone,
            boolean rush, String comments,float pizzacost, float total) {
        this.orderID = orderID;
        this.pizza = pizza;
        this.size = size;
        this.quantity = quantity;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.rush = rush;
        this.comments = comments;
        this.pizzacost = pizzacost;
        this.total = total;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isRush() {
        return rush;
    }

    public void setRush(boolean rush) {
        this.rush = rush;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPizzacost() {
        return pizzacost;
    }

    public void setPizzacost(float pizzacost) {
        this.pizzacost = pizzacost;
    }

    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", pizza=" + pizza + ", size=" + size + ", quantity=" + quantity
                + ", name=" + name + ", address=" + address + ", phone=" + phone + ", rush=" + rush + ", comments="
                + comments + ", pizzacost=" + pizzacost + ", total=" + total + "]";
    }


    public JsonObject toJSON() {
		return Json.createObjectBuilder()
			.add("orderID", getOrderID())
            .add("pizza", getPizza())
            .add("size", getSize())            
			.add("quantity", getQuantity())            
			.add("name", getName())
			.add("address", getAddress())
			.add("phone", getPhone())
			.add("rush", isRush())
			.add("comments", getComments())
			.add("pizzacost", getPizzacost())
			.add("total", getTotal())
			.build();
	}


    

    

    

    // private String orderID;
    // private Pizza pizza;
    // private Delivery delivery;

    // public Order(Pizza pizza, Delivery delivery) {
    //     this.pizza = pizza;
    //     this.delivery = delivery;
    // }

    // public String getOrderID() {
    //     return orderID;
    // }

    // public void setOrderID(String orderID) {
    //     this.orderID = orderID;
    // }

    // public String getPizza() {
    //     return this.pizza.getPizza();
    // }

}
