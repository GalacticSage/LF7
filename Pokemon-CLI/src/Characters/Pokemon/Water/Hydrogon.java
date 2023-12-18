package Characters.Pokemon.Water;

import Characters.Pokemon.WaterPokemon;

public class Hydrogon extends WaterPokemon {
    private String name = "Hydrogon";
    private String description = "Hydrogon is a Water-type Pokémon resembling a dragon made of water. It can control water at will and create powerful water-based attacks.";
    private String[] moves = {"Hydro Cannon", "Aqua Tailwhip"};
    private int[] movesDmg = {111, 147};
    public Hydrogon() {
        super();
        super.setName(this.name);
        super.setDescription(this.description);
        for (int i = 0; i < this.moves.length; i++) {
            super.addMove(this.moves[i], this.movesDmg[i]);
        }
    }
}
