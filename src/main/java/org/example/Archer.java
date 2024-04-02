package org.example;

public class Archer extends Character {
    public Archer(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    @Override
    public void special_Attack(Character opponent) {
        opponent.takeDamage(attackPower + 20);
    }
}