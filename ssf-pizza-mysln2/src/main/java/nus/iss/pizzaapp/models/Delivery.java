package nus.iss.pizzaapp.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Delivery {

    @NotNull(message="Please state your name")
	@Size(min=3, message="Your name must be longer than 3 characters")
    private String name;

	@NotNull(message="Please state your address")
	@NotEmpty(message="Please state your address")
    private String address;

    @NotNull(message="Please leave your phone contact")
	@Pattern(regexp="^[0-9]{8,}$", message="Valid Singapore phone numbers are at least 8 digits long")
    private String phone;
    
    private boolean rush = false;

    private String comments = "";


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

    @Override
    public String toString() {
        return "Delivery [name=" + name + ", address=" + address + ", phone=" + phone + ", rush=" + rush + ", comments="
                + comments + "]";
    }


    

    


    



}
