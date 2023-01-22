package Q2; // Creating a package Q2

public abstract class Bank { // Creating an abstract class 
    int balance; // Declaring a variable with integer datatype
    public abstract int getBalance(); // Method for abstract class
}


class Main { // Creating a class named Main
    public static void main(String args[]) { // Main function 
        BankA A = new BankA(); //Creating an object for class A
        BankB B = new BankB(); //Creating an object for class B
        BankC C = new BankC(); //Creating an object for class C
        System.out.println(A.getBalance()); // Displaying the output after method call for A
        System.out.println(B.getBalance()); // Displaying the output after method call for B
        System.out.println(C.getBalance()); // Displaying the output after method call for C
    }
}

