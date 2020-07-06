package com.example.learnjava;

public class Enemy {
    // Fields / Instance Variables
    private String name;
    private int hitPoints;
    private int lives;

    // Build constructor to initialize these fields
    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }


    // Build Methods
    public void takeDamage(int damage) {
        int remainingHitPoints = this.hitPoints - damage;
        if(remainingHitPoints > 0) {
            setHitPoints(remainingHitPoints);
            System.out.println("I took " + damage + " points damage, and have " + remainingHitPoints + " left.");
        } else {
            this.lives -= 1;
            System.out.println("I have lost a life");
        }
    }

    public void showInfo() {
        System.out.println("Name: " + this.name + " Hitpoints: " + this.hitPoints + " Lives: " + this.lives);
    }


    // Build Getters & Setters for fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
