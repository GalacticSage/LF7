package Characters;

public class WaterPokemon extends Pokemon {

    private String type = "Water";
    private String strongAgainst = "Fire";
    private String weakAgainst = "Grass";
    private String[] moves = {"Bubble", "Water Gun", "Hydro Pump", "Surf"};
    private int[] movePower = {40, 55, 120, 80};

    public WaterPokemon(String name) {
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
