package Characters.Pokemon.Grass;

import Characters.Pokemon.GrassPokemon;
import Characters.Pokemon.WaterPokemon;

public class Photosprout extends GrassPokemon {
    private String name = "Photosprout";
    private String description = "Photosprout is a cheerful Grass-type Pokémon with petals that resemble a smiling face. It has the ability to harness sunlight to boost its energy.";

    private String[] moves = {"Tackle", "Vine Whip"};
    private int[] movesDmg = {99, 154};
    public Photosprout() {
        super();
        setName(this.name);
        setDescription(this.description);
        for (int i = 0; i < this.moves.length; i++) {
            super.addMove(this.moves[i], this.movesDmg[i]);
        }
    }
}
