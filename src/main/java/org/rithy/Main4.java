package org.rithy;

public class Main4 {

    static int add(int x, int y) {
        return x + y;
    }

    static double add(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("Number 1 + 1 = " + add(1,1));
        System.out.println("Number 1.3 + 1.2 = " + add(1.3, 1.2));
    }
}
