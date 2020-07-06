package com.example.learnjava;

public class HelloWorld {
    public static void main(String[] args) { // psvm tab
        System.out.println("Hello World :);)"); // sout tab
        System.out.println("Hello World!!!!! My first Java program");

        String tim; // declared
        tim = "Tim Buchalka"; // assigned
//        tim = "12"; // Java does not allow type changes that differ from how it was declared
        System.out.println(tim);

        int timsWeeklySalary = 32; // declared and assigned
        int timsMonthlySalary = timsWeeklySalary * 4;
        System.out.println("Weekly salary: " + timsWeeklySalary);
        System.out.println("Monthly salary: " + timsMonthlySalary);

        int apples = 6;
        int oranges = 5;
        int fruit = apples + oranges;
        System.out.println("I have " + fruit + " fruit.");

        int weeks = 130;
        double years = weeks / 52.0; // decimals are doubles and floats
        System.out.println(weeks + " weeks is " + years + " years");

        System.out.println("Hello, " + tim + " here."); // concatenates strings
    }
}




