package org.rithy;

public class Array {
    public static void main(String[] args) {
        double[] data;
        int[] age = {12, 4, 5, 2, 5};

        data = new double[10];
        String[] array = new String[100];

        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("First Element: " + age[1]);
        System.out.println("First Element: " + age[2]);
        System.out.println("First Element: " + age[3]);
        System.out.println("First Element: " + age[4]);

        System.out.println("Using for loop:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("Using for-each loop:");
        for (int a : age) {
            System.out.println(a);
        }
    }
}
