package com.example.learnjava;

public class HelloWorld {
    public static void main(String[] args) { // psvm tab
        System.out.println("Hello World :);)"); // sout tab
        System.out.println("Hello World!!!!! My first Java program");

        String tim; // declared
        tim = "Tim Buchalka"; // assigned
//        tim = "12"; // Java does not allow type changes that differ from how it was declared
        System.out.println(tim);

        int timSalary = 32; // declared and assigned
        int monthly = timSalary * 4;
        System.out.println(timSalary);
        System.out.println(monthly);
    }
}