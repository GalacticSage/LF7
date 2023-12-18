package Characters.Pokemon.Fire;

import Characters.Pokemon.FirePokemon;

public class Flarequill extends FirePokemon {
    private String name = "Flarequill";
    private String description = "Flarequill is a small Fire-type Pokémon resembling a flaming porcupine. Its spines can shoot embers, providing protection and offense simultaneously.";
    private String[] moves = {"Ember Barrage", "Inferno Shield"};
    private int[] movesDmg = {150, 130};
    public Flarequill() {
        super();
        super.setName(this.name);
        super.setDescription(this.description);
        for (int i = 0; i < this.moves.length; i++) {
            super.addMove(this.moves[i], this.movesDmg[i]);
        }
    }
}