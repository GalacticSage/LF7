package Characters.Pokemons;

import Characters.FirePokemon;

public class Flarequill extends FirePokemon {
    private String description = "Flarequill is a small Fire-type Pokémon resembling a flaming porcupine. Its spines can shoot embers, providing protection and offense simultaneously.";
    private String[] specialMove = {"Ember Barrage", "Inferno Shield"};
    private int[] specialMovePower = {150, 130};
    public Flarequill(String name) {
        super(name);
    }
    @Override
    public String StringGetSpecialMove(int index) {
        return specialMove[index];
    }
    @Override
    public int getSpecialMovePower(int index) {
        return specialMovePower[index];
    }
}