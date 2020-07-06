package com.example.learnjava;

public class Demo {
    public static void main(String[] args) {
        Player tim = new Player();
        System.out.println(tim.getHandleName()); // handleName is set to private (access modifier)
        tim.setHandleName("Tim");
        System.out.println(tim.getHandleName());
    }
}
