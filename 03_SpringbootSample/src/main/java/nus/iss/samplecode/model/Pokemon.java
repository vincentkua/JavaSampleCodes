package nus.iss.samplecode.model;

public class Pokemon {
    private String pokemonid;
    private String name;

    public Pokemon(){

    }

    public Pokemon(String pokemonid, String name) {
        this.pokemonid = pokemonid;
        this.name = name;
    }

    public String getPokemonid() {
        return pokemonid;
    }

    public void setPokemonid(String pokemonid) {
        this.pokemonid = pokemonid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pokemon [pokemonid=" + pokemonid + ", name=" + name + "]";
    }

    

    

    


    
}
