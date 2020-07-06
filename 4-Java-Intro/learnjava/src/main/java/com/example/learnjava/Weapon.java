package com.example.learnjava;

public class Weapon {
    private String name;
    private int damageInflicted;
    private int hitPoints;

    public Weapon(String name, int damageInflicted, int hitPoints) { // when putting in arguments, they must be in the same order
        this.name = name;
        this.damageInflicted = damageInflicted;
        this.hitPoints = hitPoints;
    }

//    public Weapon(String name, int damageInflicted, int hitPoints) { // you can change the name of the parameters
//        this.name = name;
//        this.damageInflicted = damageInflicted;
//        this.hitPoints = hitPoints;
//    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageInflicted() {
        return damageInflicted;
    }

    public void setDamageInflicted(int damageInflicted) {
        this.damageInflicted = damageInflicted;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
