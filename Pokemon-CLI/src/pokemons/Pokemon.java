package pokemons;

public class Pokemon {
    private double health, attack, defense, attackModifier, defenseModifier, generalModifier;
    private String name, type;

    public Pokemon(String name, String type, double health, double attack, double defense, double attackModifier, double defenseModifier, double generalModifier) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.attackModifier = attackModifier;
        this.defenseModifier = defenseModifier;
        this.generalModifier = generalModifier;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
