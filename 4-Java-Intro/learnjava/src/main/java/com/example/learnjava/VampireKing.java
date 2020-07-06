package com.example.learnjava;

public class VampireKing extends Vampire {
    private int hitPoints;
    private int lives;

    public VampireKing(String name) {
        super(name);
        this.hitPoints = 140;
        this.lives = 3;
    }


    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }
}
