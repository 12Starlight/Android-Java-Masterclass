package com.example.learnjava;

public class Classes {
    public static void main(String[] args) {
        int lives = 3;
        boolean isGameOver = (lives < 1);
        System.out.println(isGameOver);
        // primative types: byte; short; long; double; float; // boolean, int
        // String is a class

        if(isGameOver) { // evaluates to a boolean
            System.out.println("Game over");
        } else {
            System.out.println("Your still alive");
        }
    }
}
