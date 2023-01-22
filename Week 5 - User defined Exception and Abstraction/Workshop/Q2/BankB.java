package Q2; // Creating a package Q2

class BankB extends Bank {  // Using concpet of inheritance in class BankB
    public BankB() { // Creating a constructor
        this.balance = 4000; // Using this keyword to initialize the value of balance
    }
    public int getBalance() { // Method to get balance 
        return balance; // Returning the value of balance
    }
}