package org.example;

public abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;

    public Character(String name,int health,int attackPower) {
        this.name = name; this.health = health; this.attackPower = attackPower;
    }

    public String getName() {
        if(name != null) return name;
        else return "Unknown";
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    public abstract void special_Attack(Character opponent);

    public boolean isDefeated() {
        if(health <= 0) return true;
        return false;
    }

    public void complexMethodExample() {

    }
}
