package Logic;

import Characters.Pokemon.Pokemon;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokedex;

    public Pokedex() {
        pokedex = new ArrayList<Pokemon>();
    }

    public void addPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }

    public Pokemon getPokemon(int index) {
        return pokedex.get(index);
    }

    public String getAllPokemonImportantInfo() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < pokedex.size(); i++) {
            str.append(importantInfoToStr(i));
        }
        return str.toString();
    }

    public String getPokemonImportantInfo (int index) {
        String str = "";
        str += importantInfoToStr(index);
        return str;
    }

    public String importantInfoToStr(int index) {
        String str = "";
        str += index + ") Name: " + this.pokedex.get(index).getName() + " Level: " + this.pokedex.get(index).getLevel() + "\n";
        return str;
    }
}
