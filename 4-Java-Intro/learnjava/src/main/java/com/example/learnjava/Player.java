package com.example.learnjava;

public class Player {
    // fields or instance variables
    private String handleName;
    private int lives;
    private int level;
    private int score;

    public Player() {
        handleName = "Unknown player";
        lives = 3;
        level = 1;
        score = 0;
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
}
