package org.rithy;

public class Control_FLow_Statement {
    public static void main(String[] args) {
        int number = 10;
        int number2 = 0;
        int code = 88;
        int number3 = 1;
        int n = 5;
        String language = "Java";
        // check if number in less than 0;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
        System.out.println("Statement outside if block.");

        if (language == "Java") {
            System.out.println("Best programming language");
        }

        if (number2 > 0) {
            System.out.println("The number is positive.");
        } else if (number2 < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is 0.");
        }

        if (code <= 88) {
            if (code == 88) {
                System.out.println("Wow! Great number");
            }
        }

        // Switch-case statement
        switch (number3) {
            case 1:
                System.out.println("Very small");
                break;
            case 2:
                System.out.println("Small");
                break;
            case 3:
                System.out.println("Medium");
                break;
            case 4:
                System.out.println("Big");
                break;
            case 5:
                System.out.println("Very Big");
            default:
                System.out.println("Invalid number..!");


        }
    }
}
