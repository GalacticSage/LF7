import Characters.Pokemon.Fire.Flarequill;
import Characters.Pokemon.Grass.Photosprout;
import Characters.PokemonTrainer;
public class Main {
    public static void main(String[] args) {
        PokemonTrainer player = new PokemonTrainer("Ash", 10, true);
        PokemonTrainer enemy = new PokemonTrainer("Gary", 10, true);
        Flarequill flarequill = new Flarequill();
        Photosprout photosprout = new Photosprout();
        player.capturePokemon(flarequill);
        player.capturePokemon(photosprout);
    }
}