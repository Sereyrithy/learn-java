package org.rithy;

public class Student {
    // attributes or fields
    String name = "Dara";

    // method
    void setName(String _name) {
        name = _name;
    }

    void greeting() {
        System.out.println("Welcome " + name);
    }
}
