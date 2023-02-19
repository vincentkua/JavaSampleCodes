package ref;

public class Pokemon implements Pokemondmgable {
    // member
    private int level;
    private String name;
    private String sex;
    private int maxhp;
    private int remainhp;
    private int attack;
    private int def;

    // constructor
    public Pokemon() {

    }

    public Pokemon(int level, String name, String sex, int hp, int attack, int def) {
        this.level = level;
        this.name = name;
        this.sex = sex;
        this.maxhp = hp;
        this.remainhp = hp;
        this.attack = attack;
        this.def = def;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxhp() {
        return maxhp;
    }

    public void setMaxhp(int maxhp) {
        this.maxhp = maxhp;
    }

    public int getRemainhp() {
        return remainhp;
    }

    public void setRemainhp(int remainhp) {
        this.remainhp = remainhp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    // method
    @Override
    public void hit(int damage) {
        this.remainhp -= damage;
    }

}
