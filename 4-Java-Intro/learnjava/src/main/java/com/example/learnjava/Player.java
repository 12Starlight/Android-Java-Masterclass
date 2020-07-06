package com.example.learnjava;

public class Player {
    // fields or instance variables
    private String handleName;
    private int lives;
    private int level;
    private int score;

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

    public Player(String name, int startingLevel) { // Overloading the constructor
//        this.handleName = name;
//        this.lives = 3; // default lives
//        this.level = startingLevel;
//        this.score = 0; // default score
        setHandleName(name);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
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
    }

    public void setNameAndLevel(String name, int level) {
//        this.handleName = name;
//        this.level = level;
        setHandleName(name);
        setLevel(level);
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
}
