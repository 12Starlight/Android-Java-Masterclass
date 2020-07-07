package com.example.learnjava;


public class Demo { // cmd + 1 opens project // cmd + 4 opens run // opt + fn + f12 // opt + cmd + l reformats code
    public static void main(String[] args) {
        Player tim = new Player();
        System.out.println(tim.getHandleName()); // handleName is set to private (access modifier)
//        tim.setNameAndLevel("Ti", 5);
        tim.setNameAndLevel("Timothy", 5);
        System.out.println(tim.getHandleName());
        System.out.println("Level: " + tim.getLevel());
        System.out.println("Lives: " + tim.getLives());
//        System.out.println(tim.getWeapon().getName()); // method chaining
        Weapon timsWeapon = tim.getWeapon();
        System.out.println(timsWeapon.getName().toUpperCase());

//        Player louise = new Player("Louise");
//        System.out.println(louise.getHandleName());
////        louise.setLives("5"); // requires an int
//        louise.setLives(5);
//        System.out.println("Level: " + louise.getLevel());
//        System.out.println("Lives: " + louise.getLives());
//
//        Player gr8 = new Player("gr8", 9);
//        System.out.println(gr8.getHandleName());
//        System.out.println("Level: " + gr8.getLevel());
//        System.out.println("Lives: " + gr8.getLives());

        Player louise = new Player("Louise");
        System.out.println(louise.getHandleName());

        System.out.println("\n");
//        Player tomSmith = new Player(); // constructor 1
//        Player tomSmith = new Player("Tom Smith"); // constructor 2
        Player tomSmith = new Player("Tom Smith", 8); // constructor 3
        System.out.println(tomSmith.getHandleName());
//        System.out.println("Level: " + tomSmith.getLevel());
//        System.out.println("Lives: " + tomSmith.getLives());
//        Weapon tomsWeapon = tomSmith.getWeapon();
//        System.out.println(tomsWeapon.getName());

        System.out.println("\n");
//        System.out.println(tomSmith.getWeapon().getName());
        Weapon myAxe = new Weapon("Goldshine Axe", 15, 50);
        tomSmith.setWeapon(myAxe);
//        System.out.println(tomSmith.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        tomSmith.pickUpLoot(redPotion);

        tomSmith.pickUpLoot(new Loot("+3 Chest Armor", LootType.ARMOR, 80));
        tomSmith.pickUpLoot(new Loot("Ring of Protection + 2", LootType.RING, 40));
        tomSmith.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 35));

        tomSmith.showInventory();

//        Loot bluePotion = new Loot("Blue Potion", LootType.POTION, 6);
//        boolean wasDeleted = tomSmith.dropLoot(bluePotion); // there is not a blue potion in our inventory
        boolean wasDeleted = tomSmith.dropLoot(redPotion);
        System.out.println(wasDeleted);
        tomSmith.showInventory();

        System.out.println("\n========================================");
        Enemy enemy = new Enemy("Test Enemy", 10, 3);
        enemy.showInfo();
        enemy.takeDamage(3);
        enemy.showInfo();
        enemy.takeDamage(11);
        enemy.showInfo();

        System.out.println("\n========================================");
        Troll prettyTroll = new Troll("Pretty Troll");
        prettyTroll.showInfo();
        prettyTroll.takeDamage(8);
        prettyTroll.takeDamage(30);

        System.out.println("\n========================================");
        Vampire vlad = new Vampire("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();

        System.out.println("\n========================================");
//        VampireKing boss = new VampireKing("Boss");
//        boss.showInfo();
//        boss.takeDamage(8);
//        boss.showInfo();

//        System.out.println("\n========================================");
//        for(int i = 0; i<10; i++) { // there is no ArrayList to loop through, so we need to use a for loop
//            VampireKing boss = new VampireKing("Boss");
//            boss.showInfo();
//
//            while (boss.getLives() > 0) {
//                if(boss.dodges()) {
//                    continue;
//                }
//                if(boss.runAway()) {
//                    System.out.println("Boss ran away");
//                    break;
//                } else {
//                    boss.takeDamage(80);
//                    boss.showInfo();
//                }
//            }
//            System.out.println("========================================");
//        }

//        VampireKing boss = new VampireKing("Boss");
//        boss.showInfo();
//
//        boss.setLives(0);
//
//        do { // do while loop ensures that the code gets executed at least once
//            if(boss.dodges()) {
//                boss.setLives(boss.getLives() + 1);
//                continue;
//            }
//            if(boss.runAway()) {
//                System.out.println("Boss ran away");
//                break;
//            } else {
//                boss.takeDamage(80);
//                boss.showInfo();
//            }
//        } while (boss.getLives() > 0); // test is not done until the end
//        System.out.println("========================================");


        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();

        System.out.println(conan.score());
    }
}
