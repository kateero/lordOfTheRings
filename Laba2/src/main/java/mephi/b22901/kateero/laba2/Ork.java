package mephi.b22901.kateero.laba2;

public class Ork {

    private String name;
    private String weapon;
    private String armor;
    private String banner;
    private double strenght;
    private double agility;
    private double intelligence;
    private double health;

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrenght(double strenght) {
        this.strenght = strenght;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getStrenght() {
        return strenght;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public String getArmor() {
        return armor;
    }

    public String getBanner() {
        return banner;
    }

    public double getAgility() {
        return agility;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public double getHealth() {
        return health;
    }
    
    @Override
    public String toString(){
        return name;
    }

}
