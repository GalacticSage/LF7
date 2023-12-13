package Characters;

abstract public class Pokemon {
    private String name;
    private int level;
    private int hp;

    private double attackMultiplier = 1.0;
    private double defenseMultiplier = 1.0;

    public double getAttackMultiplier() {
        return attackMultiplier;
    }

    public void setAttackMultiplier(double attackMultiplier) {
        this.attackMultiplier = attackMultiplier;
    }

    public double getDefenseMultiplier() {
        return defenseMultiplier;
    }

    public void setDefenseMultiplier(double defenseMultiplier) {
        this.defenseMultiplier = defenseMultiplier;
    }

    public Pokemon(String name) {
        this.name = name;
        this.level = 1;
        this.hp = 150;
    }

    public void increaseLevel() {
        setLevel(getLevel() + 1);
        setHp(100 * getLevel());
        setAttackMultiplier(getAttackMultiplier() + 0.1);
        setDefenseMultiplier(getDefenseMultiplier() + 0.1);
    }
    abstract public String getType();
    abstract public String getMove(int index);
    abstract public int getMovePower(int index);
    abstract public String StringGetSpecialMove(int index);
    abstract public int getSpecialMovePower(int index);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
