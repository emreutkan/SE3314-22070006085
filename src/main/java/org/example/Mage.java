package org.example;

public class Mage extends Character {
    public Mage(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void special_Attack(Character Opponent) {
        Opponent.takeDamage(attackPower + 50);
    }
}
