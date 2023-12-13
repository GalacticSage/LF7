package Characters;

public class GrassPokemon extends Pokemon{
    private String type = "Grass";
    private String strongAgainst = "Water";
    private String weakAgainst = "Fire";
    private String[] moves = {"Vine Whip", "Razor Leaf", "Solar Beam", "Seed Bomb"};
    private int[] movePower = {40, 55, 120, 80};

    public GrassPokemon(String name, int level) {
        super(name);
    }

    public String getMove(int index) {
        return moves[index];
    }

    public int getMovePower(int index) {
        return movePower[index];
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStrongAgainst() {
        return strongAgainst;
    }

    public void setStrongAgainst(String strongAgainst) {
        this.strongAgainst = strongAgainst;
    }

    public String getWeakAgainst() {
        return weakAgainst;
    }

    public void setWeakAgainst(String weakAgainst) {
        this.weakAgainst = weakAgainst;
    }
}
