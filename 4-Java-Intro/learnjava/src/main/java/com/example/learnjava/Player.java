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
        handleName = name;
        lives = 3; // default lives
        level = startingLevel;
        score = 0; // default score
    }


    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String name) { // because it does not return anything we set the return to void
        if(name.length() < 3) {
            return;
        }
        handleName = name;
    }

    // Android Studio generates getters and setters for us // cmd + n
    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
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
