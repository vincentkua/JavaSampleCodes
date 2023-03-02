package nus.iss.pizzaapp.models;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Pizza {

    @NotNull(message="You forgot to select a pizza")
    private String pizza;

    @NotNull(message="Must specify a pizza size")
    private String size;

    @Min(value=1, message="You must order at least 1 pizza")
	@Max(value=10, message="You can only purchase a maximum of 10 pizzas")
    private int quantity;

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

    @Override
    public String toString() {
        return "Pizza [pizza=" + pizza + ", size=" + size + ", quantity=" + quantity + "]";
    }
    
    


    



    
}
