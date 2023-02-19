package nus.iss.pokemon.model;


public class Pokemon {
    private int pokemonID;
    private String name;
    private int hp;
    private int attack;
    private int level;


    public Pokemon() {
    }
    
    public Pokemon(int pokemonID, String name, int hp, int attack, int level) {
        this.pokemonID = pokemonID;
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.level = level;
    }

    public int getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    



    
    
}
