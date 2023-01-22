package Q2; // Creating a package Q2

class BankC extends Bank { // Using concpet of inheritance in class BankC
    public BankC() { // Creating a constructor
        this.balance = 5000; // Using this keyword to initialize the value of balance
    }
    public int getBalance() { // Method to get balance 
        return balance; // Returning the value of balance
    }
}