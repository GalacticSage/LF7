package Characters.Pokemon;

public abstract class WaterPokemon extends Pokemon {
    private String type = "Water";
    private String[] moves = {"Bubble", "Surf"};
    private int[] movesDmg = {40, 55};
    public WaterPokemon() {
        super();
        super.setType(type);
        for (int i = 0; i < this.moves.length; i++) {
            super.addMove(this.moves[i], this.movesDmg[i]);
        }
    }
}
