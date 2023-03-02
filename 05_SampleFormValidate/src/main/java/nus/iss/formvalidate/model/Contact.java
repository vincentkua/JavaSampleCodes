package nus.iss.formvalidate.model;

import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Contact {

    // @NotNull(message = "Name is a Mandotary Field")
    @NotBlank(message = "Name is a Mandotary Field")
    @Size(min = 3, message = "Your name must be longer than 3 characters")
    private String name;

    // @NotNull(message = "Email is a Mandotary Field")
    @NotBlank(message = "Email is a Mandotary Field")
    private String email;

    // @NotNull(message = "Phone is a Mandotary Field")
    @NotBlank(message = "Phone is a Mandotary Field")
    private String phone;

    public Contact() {
    }

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }

}
