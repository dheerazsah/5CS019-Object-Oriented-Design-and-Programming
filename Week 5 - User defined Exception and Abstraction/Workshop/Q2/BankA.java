package Q2; // Creating a package Q2

class BankA extends Bank {  // Using concpet of inheritance in class BankA
    public BankA() { // Creating a constructor
        this.balance = 3000; // Using this keyword to initialize the value of balance
    }
    public int getBalance() { // Method to get balance 
        return balance; // Returning the value of balance
    }
}