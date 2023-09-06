package org.rithy;

public class Main3 {

    // define method or function
//    static void getGreeting() {
//        System.out.println("Hello World");
//    }

//    static void getfullname(String firstname, int age) {
//        String fname;
//        if(firstname == null) fname = "Dara";
//        else fname = firstname;
//        System.out.println("Hello " + fname + " and age: "+ age +" years old: ");
//    }
    static  int add(int x, int y){
        if (x == 0 && y == 0) {
            return 1 + 1;
        }

        return x + y;
    }

    public static void main(String[] args) {

        System.out.println("Number 1 + 2 = " + add(1,2));
        System.out.println("Number 2 + 2 = " + add(2,2));
        System.out.println("Number 0 + 0 = " + add(0,0));

//        getfullname(null, 20);
//        getfullname("rithy", 25);

        // invoke or call method
//        getGreeting();
//        getGreeting();
//        getGreeting();
//        getGreeting();

    }
}
