package nus.iss.pokedex.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Pokemon {
    // @NotEmpty(message = "Name is a mandotory field")
    // @NotBlank(message = "Email is a mandotory field")
    @NotNull(message = "ID is a mandotory field")
    @Min(value = 5, message = "must be greater than 5")
    private int id;

    @NotEmpty(message = "Name is a mandotory field")
    @NotBlank(message = "Email is a mandotory field")
    private String name;

    @Min(value = 1000, message = "must be greater than 1000")
    private int power;


    public Pokemon() {
    }


    public Pokemon(int id, String name, int power) {
        this.id = id;
        this.name = name;
        this.power = power;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getPower() {
        return power;
    }


    public void setPower(int power) {
        this.power = power;
    }


    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + power;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pokemon other = (Pokemon) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (power != other.power)
            return false;
        return true;
    }


    @Override
    public String toString() {
        return "Pokemon [id=" + id + ", name=" + name + ", power=" + power + "]";
    }



    

    

    






    
    
}
