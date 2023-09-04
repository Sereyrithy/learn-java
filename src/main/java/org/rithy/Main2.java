package org.rithy;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        double a, b, value;
//        System.out.println("Welcome to our exam");
//        System.out.print("Please enter A: ");
//        a = input.nextDouble();
//        System.out.print("Please enter B: ");
//        b = input.nextDouble();

//        value = a + b;
//        value = a - b;
//        value = a * b;
//        value = a / b;
//        value = a % b;
//        a++;
//        ++a;
//        b--;
//        --b;

//        System.out.println("A= " + a + " and B= " + b + " equal to " + value);
//        System.out.println("A = " + a);
//        System.out.println("B = " + b);

//////////////////////////////////////////////////
            // Logical Operator //
//////////////////////////////////////////////////

//        int a = 30, b = 20;
//        System.out.println("A= " + a + "\tB= " + b);
//
//        if (!(a > 50 && b > 50)) {
//            System.out.println("A and B are not bigger than 50");
//        }

//        boolean correct = false;
//        if (correct == false) {
//            System.out.println("Hello correct equal to false");
//        }
//        if (!correct) {
//            System.out.println("Hello correct equal to false");
//        }


//        System.out.println("Maximum: " + Math.max(10, 20));
//        System.out.println("Minimum: " + Math.min(10, 20));
//        System.out.println("Square Root: " + Math.sqrt(26));
//        System.out.println("Absolute: " + Math.abs(-23));
//        System.out.println("Floor: " + Math.floor(102.4));
//        System.out.println("Round: " + Math.round(23.75));
//        System.out.println("Random: " + Math.random() * 10);

//////////////////////////////////////////////////
                  // String //
//////////////////////////////////////////////////

//        String greeting = "Hello";
//        System.out.println("Hello length of greeting: " + greeting.length());
//        System.out.println("Hello greeting in upper case: " + greeting.toUpperCase());
//        System.out.println("Hello greeting in lower case: " + greeting.toLowerCase());
//
//        String greetingText = "Hello World From World";
//        System.out.println("Hello Index of World: " + greetingText.indexOf("World"));
//
//        String firstName = "John";
//        String lastName = "Doe";
//        System.out.println("Hello Full Name 1: " + firstName + " " + lastName);
//        System.out.println("Hello Full Name 2: " + firstName.concat(" ").concat(lastName).concat(" Hello"));
//
//        System.out.println("Hello \"World\"");
//        System.out.println("Hello 'World'");
//        System.out.println("Hello \\\\ World");
//        System.out.println("Hello \nWorld");
//        System.out.println("Hello \t World");

//////////////////////////////////////////////////
           // Control flow statement //
//////////////////////////////////////////////////

        //        if (20 < 25) {
//            System.out.println("20 is bigger than 25");
//        }
//
//        if (20 < 18) {
//            System.out.println("20 is bigger than 18");
//        } else {
//            System.out.println("18 is smaller than 20");
//        }
//
//        if (10 > 30) {
//            System.out.println("10 is bigger than 30");
//        } else if (20 > 30) {
//            System.out.println("20 is bigger than 30");
//        } else {
//            System.out.println("30 is bigger than 20 and 10");
//        }

//        String result = (20 > 18) ? ((20 < 19) ? "Good Day" : "Best Day") : "Good Evening";
//        String value = (20 > 10) ? "Good" : "Not good";
//        System.out.println("Hello " + result);
//        System.out.println(value);


//////////////////////////////////////////////////
                    // Loop //
//////////////////////////////////////////////////

        // infinite loop //
//        while (true) {
//            System.out.println("Hello");
//        }

        // While Loop //
//        int i = 0;
//        while (i < 5) {
//            System.out.println("hello " + i);
//            i++;
//        }

        // Do While Loop //
//        int i = 0;
//        do {
//            System.out.println("Hello " + i);
//            i ++;
//        } while (i < 5);

        // for loop //
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello ForLoop1 " + i);
//        }

//        int i = 0;
//        for (; i < 5;) {
//            System.out.println("Hello ForLoop2 " + i);
//            i++;
//        }

        // Break //
//        int i = 0;
//        while (i < 5) {
//            if (i == 2) break;
//            System.out.println("hello " + i);
//            i++;
//        }

        // using continue keyword //
//        int i = 0;
//        while (i < 5) {
//            if (i == 2) {
//                i++;
//                continue;
//            }
//            System.out.println("Hello " + i);
//            i++;
//        }

        long[] number = {1,2,3,4,5};
        System.out.println("My number = " + number[4]);

    }
}
