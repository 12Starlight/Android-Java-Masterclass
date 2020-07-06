package com.example.learnjava;

public class Vampire extends Enemy {
    public Vampire(String name) {
        super(name, 20, 3);
    }


    @Override // annotation checks superclass method (will not do that without annotation) // create method with same name, same parameters, and same return (void), but different implementation
    public void takeDamage(int damage) {
        int damageDone = (damage / 2);
        super.takeDamage(damageDone); // common to call the super method, but it is not necessary
//        int hitPoints = getHitPoints();
//        hitPoints -= (damage / 2);
//        setHitPoints(hitPoints);
    }
}
