package Characters.Pokemon;

 public abstract class GrassPokemon extends Pokemon{
    private String type = "Grass";
    private String[] moves = {"Razor Leaf", "Solar Beam"};
    private int[] movesDmg = {40, 55};

    public GrassPokemon() {
        super();
        super.setType(type);
        for (int i = 0; i < this.moves.length; i++) {
            super.addMove(this.moves[i], this.movesDmg[i]);
        }
    }
}
