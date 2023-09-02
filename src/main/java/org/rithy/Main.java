package org.rithy;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("1 println");
        System.out.println("2 println");

        System.out.print("1 print");
        System.out.println("2 print");

        double salary = 500;

        System.out.println(salary);
        System.out.println(1000);

        System.out.println("My job" + "is a Java Developer");
        System.out.println("My salary is " + salary);

        System.out.print("Input your integer = ");

        // 1. Create an object of Scanner
        Scanner scanner = new Scanner(System.in);

        // 2. Take input from user by method nextInt()
        int number = scanner.nextInt();

        System.out.println("Number= " + number);

        // Type Casting
        // Widening Casting
        int a = 10;
        double b = a;
        System.out.println("hello b: " + b);

        // Narrowing Casting
        float c = 1.5f;
        short d = (short) c;
        System.out.println("hello d: " + d);

        // Convert from int to String
        int e = 123;
        String f = String.valueOf(e); // "123"
        System.out.println("Hello F: " + f);

        // Convert from String to double
        double g = Double.parseDouble(f);
        System.out.println("Hello G: " + g);

        // Convert from String to long
        long ll = Long.parseLong(f);
        System.out.println("Hello LL: " + ll);

        // Convert from String to boolean
        boolean bol = Boolean.parseBoolean("false");
        System.out.println("Hello Bol: " + bol);
    }
}