package org.rithy;

public class Main6 {
    public static void main(String[] args) {
        // initialize object
        Student Dara = new Student();
        Student Java = new Student();
        Java.setName("Java");
        System.out.println("Student No.1: " + Dara.name);
        Dara.greeting();
        System.out.println("Student No.2: " + Java.name);
        Java.greeting();
    }
}
