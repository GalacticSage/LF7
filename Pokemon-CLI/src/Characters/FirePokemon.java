package Characters;

public abstract class FirePokemon extends Pokemon{

    private String type = "Fire";
    private String[] moves = {"Ember", "Fire Blast", "Flamethrower", "Fire Punch"};
    private int[] movePower = {40, 55, 120, 80};
    public FirePokemon(String name) {
        super(name);
    }
    @Override
    public String getMove(int index) {
        return moves[index];
    }
    @Override
    public int getMovePower(int index) {
        return movePower[index];
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
