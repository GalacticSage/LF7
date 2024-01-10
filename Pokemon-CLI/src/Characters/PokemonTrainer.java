package Characters;

import Characters.Pokemon.Pokemon;

import java.util.ArrayList;

public class PokemonTrainer {
    private String name;
    private int age;
    private boolean isMale;
    private ArrayList<Integer> pokemonTeam = new ArrayList<>();

    public ArrayList<Pokemon> capturedPokemon = new ArrayList<>();
    private int pokemonTeamSize = 2;

    public PokemonTrainer(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public void capturePokemon(Pokemon pokemon) {
        capturedPokemon.add(pokemon);
    }

    public void addPokemonToTeam(int pokemonIndex) {
        pokemonTeam.add(pokemonIndex);
    }

    public void removePokemonFromTeam(int pokemonIndex) {
        pokemonTeam.remove(pokemonIndex);
    }

    private String pokemonImportantInfo(int pokemonIndex) {
        return pokemonIndex + ") " + capturedPokemon.get(pokemonIndex).getName() + " (" + capturedPokemon.get(pokemonIndex).getType() + ") - Level " + capturedPokemon.get(pokemonIndex).getLevel();
    }

    public String AllPokemonImportantInfo() {
        String info = "";
        for (int i = 0; i < capturedPokemon.size(); i++) {
            info += pokemonImportantInfo(i) + "\n";
        }
        return info;
    }
}