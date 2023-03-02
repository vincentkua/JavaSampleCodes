package nus.iss.day13workshopadrsbook.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
// import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Contact {

    @NotEmpty(message = "Name is mandotory field")
    @Size(min = 3, max = 64, message = "Must between 3-64 Char")
    private String name;

    @Email(message = "Invalid Email Format")
    private String email;

    // @Pattern(regexp = "(8|9)[0-9]{7}", message = "Invalid Phone format")
    private Integer phone;

    @NotNull(message = "DOB is a mandotory field")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent(message = "Birth Date Cannot be greater than today")
    private Date dob;

    public Contact() {
    }

    public Contact(
            String name,
            String email,
            Integer phone,
            Date dob) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }


    @Override
    public String toString() {
        return "Contact [name=" + name + ", email=" + email + ", phone=" + phone + ", dob=" + dob + "]";
    }


    

    
}
