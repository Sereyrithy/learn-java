package org.rithy;

public class Customer {
    // attributes
    int id;
    String name;
    String gender;
    String phoneNumber;

    // default constructor
    Customer() {
        id = 1;
        name = "Dara";
        gender = "Male";
        phoneNumber = "098 888 888";
    }

    // parameterized constructor
    Customer(String _name, String _gender, String _phoneNumber) {
        id = (int) Math.floor(Math.random() * 1000);
        name = _name;
        gender = _gender;
        phoneNumber = _phoneNumber;
    }

    Customer(String _name, String _gender, int _phoneNumber) {
        id = (int) Math.floor(Math.random() * 1000);
        name = _name;
        gender = _gender;
        phoneNumber = "+855-" + _phoneNumber;
    }
}
