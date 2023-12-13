package Logic;

import Characters.Pokemon;

public class BattleSystem {

    private Boolean isPlayerTurn = true;
    private Boolean isBattleOver = false;

    public void attack(Pokemon attacker, Pokemon defender, int moveIndex) {
        String attackerType = attacker.getType();
        switch(attackerType){
            case "Fire":
                if(defender.getType().equals("Grass")){
                    defender.setHp(defender.getHp() - (int)(attacker.getMovePower(moveIndex) * attacker.getAttackMultiplier() * 1.5));
                }
                else if(defender.getType().equals("Water")){
                    defender.setHp(defender.getHp() - (int)(attacker.getMovePower(moveIndex) * attacker.getAttackMultiplier() * 0.5));
                }
                else{
                    defender.setHp(defender.getHp() - (int)(attacker.getMovePower(moveIndex) * attacker.getAttackMultiplier()));
                }
                break;
            case "Water":
                if(defender.getType().equals("Fire")){
                    defender.setHp(defender.getHp() - (int)(attacker.getMovePower(moveIndex) * attacker.getAttackMultiplier() * 1.5));
                }
                else if(defender.getType().equals("Grass")){
                    defender.setHp(defender.getHp() - (int)(attacker.getMovePower(moveIndex) * attacker.getAttackMultiplier() * 0.5));
                }
                else{
                    defender.setHp(defender.getHp() - (int)(attacker.getMovePower(moveIndex) * attacker.getAttackMultiplier()));
                }
                break;
            case "Grass":
                if(defender.getType().equals("Water")){
                    defender.setHp(defender.getHp() - (int)(attacker.getMovePower(moveIndex) * attacker.getAttackMultiplier() * 1.5));
                }
                else if(defender.getType().equals("Fire")){
                    defender.setHp(defender.getHp() - (int)(attacker.getMovePower(moveIndex) * attacker.getAttackMultiplier() * 0.5));
                }
                else{
                    defender.setHp(defender.getHp() - (int)(attacker.getMovePower(moveIndex) * attacker.getAttackMultiplier()));
                }
                break;
        }
    }
}