package Q3; // Creating a package Q3
import java.util.HashMap; // Importing hash map library

public class BankAccount { // Creating a class named bank account 
    int accountNumber; // Declaring a variable 
    double balance; // Declaring a variable

    public BankAccount(int accountNumber, double balance) {  // Creating a class constructor with parameters
        this.accountNumber = accountNumber; // Using this keyword to access the variable
        this.balance = balance; // Using this keyword to access the variable
    }

    int getAccountNumber() { // Function to get the account number 
        return accountNumber; // Returning the account number
    }

    double getBalance() { // Function to get the balance
        return balance; // Returning the balance
    }

    void credit(double balance) { // Function for credit 
        this.balance += balance; // Using this keyword to access the variable
        return; // Returning the credit value 
    }
}

class HHMM { // Creating a class
    public static void main(String[] args) { // Main function
        HashMap<Integer,Double> hm = new HashMap<Integer,Double>(); // Creating a object for hash map
        BankAccount newObj = new BankAccount(1234567890, 100.00); // Creating object and passing value to variables 
        BankAccount newObj2 = new BankAccount(1234567892, 200.00); // Creating object and passing value to variables 
        BankAccount newObj3 = new BankAccount(1234567896, 300.00); // Creating object and passing value to variables 
        hm.put(newObj.getAccountNumber(), newObj.getBalance()); // Object call 
        hm.put(newObj2.getAccountNumber(), newObj2.getBalance()); // Object call 
        hm.put(newObj3.getAccountNumber(), newObj3.getBalance()); // Object call 
        System.out.println(hm); // Prints output 
        hm.replace(1234567890, 100.00, 200.00); // Replaces the existing value
        System.out.println(hm); // Prints output 
    }
}
