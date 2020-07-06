package com.example.learnjava;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player();
        System.out.println(tim.getHandleName()); // handleName is set to private (access modifier)
        tim.setHandleName("Tim");
        System.out.println(tim.getHandleName());
        System.out.println("Level: " + tim.getLevel());
        System.out.println("Lives: " + tim.getLives());

        Player louise = new Player("Louise");
        System.out.println(louise.getHandleName());
        louise.setLives(5);
        System.out.println("Level: " + louise.getLevel());
        System.out.println("Lives: " + louise.getLives());

        Player gr8 = new Player("gr8", 9);
        System.out.println(gr8.getHandleName());
        System.out.println("Level: " + gr8.getLevel());
        System.out.println("Lives: " + gr8.getLives());
    }
}
