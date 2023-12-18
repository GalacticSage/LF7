package Characters;

import Characters.Pokemon.Pokemon;
import Logic.Pokedex;

import java.util.ArrayList;

public class PokemonTrainer extends Pokedex{
    private String name;
    private int age;
    private boolean isMale;

    private ArrayList<Integer> pokemonTeam;

    public PokemonTrainer(String name, int age, boolean isMale) {
        super();
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        pokemonTeam = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void showAllPokemon() {
        System.out.println("All captured Pokemons:\n");
        System.out.println(getAllPokemonImportantInfo());
    }

    public void showPokemonTeam() {
        System.out.println("Pokemon Team:\n");
        for (int i = 0; i < pokemonTeam.size(); i++) {
            System.out.println(getPokemonImportantInfo(pokemonTeam.get(i)));
        }
    }

    public void addPokemonToTeam(int index) {
        pokemonTeam.add(index);
    }

    public void removePokemonFromTeam(int index) {
        pokemonTeam.remove(index);
    }
}
