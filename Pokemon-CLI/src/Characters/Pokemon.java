package Characters;

import java.util.ArrayList;

abstract public class Pokemon {
    private String name, description, type;
    private int level, exp, hp;
    private double atkMultiplier, defMultiplier;
    private ArrayList<String> moves;
    private ArrayList<Integer> movesDmg;

    public Pokemon() {
        name = "";
        description = "";
        type = "";
        level = 1;
        exp = 0;
        hp = 100;
        atkMultiplier = 1.0;
        defMultiplier = 1.0;
        moves = new ArrayList<String>();
        movesDmg = new ArrayList<Integer>();
    }

    public String getMove(int index) {
        return this.moves.get(index);
    }

    public int getMoveDmg(int index) {
        return this.movesDmg.get(index);
    }

    public String moveToStr(int index) {
        return index + ") " + this.moves.get(index) + " (" + this.movesDmg.get(index) + " dmg)";
    }

    public String allMovesToStr() {
        String str = "";
        for (int i = 0; i < this.moves.size(); i++) {
            str += this.moves.get(i) + " (" + this.movesDmg.get(i) + " dmg)\n";
        }
        return str;
    }

    public void addMove(String move, int dmg) {
        this.moves.add(move);
        this.movesDmg.add(dmg);
    }

    public void levelUp() {
        if (this.level == 100) {
            System.out.println("You are already at max level!");
        } else if (this.exp < 100) {
            System.out.println("You do not have enough experience to level up!");
            System.out.println("You need " + (100 - this.exp) + " more experience to level up!");
        }
        else {
            this.level++;
            this.exp = 0;
            this.hp += 10;
            this.atkMultiplier += 0.1;
            this.defMultiplier += 0.1;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getExp() {
        return exp;
    }

    public int getHp() {
        return hp;
    }

    public double getAtkMultiplier() {
        return atkMultiplier;
    }

    public double getDefMultiplier() {
        return defMultiplier;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAtkMultiplier(double atkMultiplier) {
        this.atkMultiplier = atkMultiplier;
    }

    public void setDefMultiplier(double defMultiplier) {
        this.defMultiplier = defMultiplier;
    }
}