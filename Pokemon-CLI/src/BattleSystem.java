import Characters.PokemonTrainer;

import java.util.Scanner;

public class BattleSystem {
    Scanner in = new Scanner(System.in);
    PokemonTrainer player;
    PokemonTrainer enemy;

    public BattleSystem(PokemonTrainer player, PokemonTrainer enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void Battle() {
        System.out.println("A wild " + enemy.capturedPokemon.get(0).getName() + " appeared!");
        System.out.println("Go! " + player.capturedPokemon.get(0).getName() + "!");
        System.out.println("What will " + player.capturedPokemon.get(0).getName() + " do?");
        System.out.println("1) Fight");
        System.out.println("2) Pokemon selection");
        System.out.println("3) Run");
        int choice = in.nextInt();
        switch (choice) {
            case (1):
                break;
            case (2):
                break;
            case (3):
                break;
        }
    }
}