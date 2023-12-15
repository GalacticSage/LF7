package Characters;

public abstract class FirePokemon extends Pokemon{

    private String type = "Fire";
    private String[] moves = {"Fire Blast", "Fire Punch"};
    private int[] movesDmg = {40, 55};

    public FirePokemon() {
        super();
        super.setType(type);
        for (int i = 0; i < this.moves.length; i++) {
            super.addMove(this.moves[i], this.movesDmg[i]);
        }
    }
}