package org.rithy;

public class Main7 {
    public static void main(String[] args) {
        Customer customerdara = new Customer();
        Customer customerrithy = new Customer("Rithy", "Male", "016 727" +
                "570");
        Customer customersokha = new Customer("Sokha", "Male", 123345);
        System.out.println("Customer 1 ID: " + customerdara.id);
        System.out.println("Customer 1 Name: " + customerdara.name);
        System.out.println("Customer 1 Gender: " + customerdara.gender);
        System.out.println("Customer 1 Phone: " + customerdara.phoneNumber);
        System.out.print("\n");
        System.out.println("Customer 2 ID: " + customerrithy.id);
        System.out.println("Customer 2 Name: " + customerrithy.name);
        System.out.println("Customer 2 Gender: " + customerrithy.gender);
        System.out.println("Customer 2 Phone: " + customerrithy.phoneNumber);
        System.out.print("\n");
        System.out.println("Customer 3 ID: " + customersokha.id);
        System.out.println("Customer 3 Name: " + customersokha.name);
        System.out.println("Customer 3 Gender: " + customersokha.gender);
        System.out.println("Customer 3 Phone: " + customersokha.phoneNumber);


    }
}
