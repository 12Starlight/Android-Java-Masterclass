package com.example.learnjava;

import java.util.ArrayList;


public class Player {
    // fields or instance variables
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon; // Object
    private ArrayList<Loot> inventory; // ArrayList
//    private Weapon weapon2; // We do not want to do this
//    private Weapon weapon3;
//    private Weapon weapon4;


    public Player() {
        this("Unknown player"); // default name
    }

    public Player(String name) { // Overloading the constructor
        this(name, 1); // default level
//        handleName = name;
//        lives = 3;
//        level = 1;
//        score = 0;
    }

    public Player(String name, int startingLevel) { // Overloading the constructor // Concept of name and parameters is known as the "method signature."
//        this.handleName = name;
//        this.lives = 3; // default lives
//        this.level = startingLevel;
//        this.score = 0; // default score
        setHandleName(name);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
//        setDefaultWeapon();
        inventory = new ArrayList<>(); // also need initialize ArrayList // diamond
    }


    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handle) { // because it does not return anything we set the return to void
        if (handle.length() < 3) {
            System.out.println("The name " + handle + " must be at least 3 characters long.");
            return;
        }
        this.handleName = handle;
        setDefaultWeapon();
    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public void setNameAndLevel(String name, int level) {
//        this.handleName = name;
//        this.level = level;
        setHandleName(name);
    }

    // Android Studio generates getters and setters for us // cmd + n
    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives; // removes ambiguity or confusion
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Weapon Getters & Setters
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // Inventory Getters & Setters
    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }

    public void pickUpLoot(Loot newLoot) {
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot) {
        if(this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }
}
