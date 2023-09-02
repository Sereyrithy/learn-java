package org.rithy;

public class Loop {
    public static void main(String[] args) {

        int n = 5;
        int j = 1;
        // for loop, while loop, do-while loop

        for (int i = 0; i < n; i++) {
            System.out.println("Java is fun");
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        // While loop

//        while (j <= 5) {
//            System.out.println("I love Java");
//            n++;
//        }

        // do-while

        do {
            System.out.println(j);
            j++;
        } while (j <= n);

    }
}
