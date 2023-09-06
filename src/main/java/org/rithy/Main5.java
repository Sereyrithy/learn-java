package org.rithy;

public class Main5 {
    int x = 5;
    public static void main(String[] args) {
        Main5 myobj = new Main5();
        Main5 myobj2 = new Main5();
        Main5 myobj3 = new Main5();
        // modify
        myobj2.x = 10;
        myobj3.x = 20;
        System.out.println("Hello x: " + myobj.x);
        System.out.println("Hello x: " + myobj2.x);
        System.out.println("Hello x: " + myobj3.x);
    }
}
