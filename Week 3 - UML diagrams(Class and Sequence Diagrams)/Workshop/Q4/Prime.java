package Q4; // Creating a package Q4
import java.util.Scanner; // Importing Scanner that tells the compiler to use Scanner

public class Prime extends PrimeNum { // Using concpet of inheritance
    public Prime(int number) { // Creating a constructor 
        super(number); // Using super key
    }

    public void printPrimeOrNot(){ // Creating a method to check prime number
        int number = super.getNumber(); // Declaring a variable and getting the number
        if (super.checkPrime()) { // Initializing If else statement 
            System.out.println("It is Prime number" ); // Output result
        }else{
            System.out.println("It is not prime number"); // Output result
        }
    }
    public static void main(String[] args) { // Main method 
        System.out.print("\nEnter any number: "); // Asking user to enter value 
        Scanner scanner = new Scanner(System.in); // Creating an object for Scanner
        int number = scanner.nextInt(); // Scanning user input and storing it in number varibale
        Prime prime = new Prime(number); // Creating an object for Prime class
        prime.printPrimeOrNot(); // Method call using object 
        scanner.close(); // Closing scanner
    }
}




