package Q2; // Creating a package Q1
import java.util.Scanner; // Importing Scanner library to scan user input

public class Divide { // Creating a class named Divide
    public static void main(String[] args) { // Creating a main function
        int num1, num2; // Declaring two integers variables

        try{ // Implementing try-catch for exception handling
        Scanner input = new Scanner(System.in); // Creating an object named input for Scanner
        System.out.println("Enter first number: "); // Asking user for input
        num1 = input.nextInt(); // Storing the user input in num1 variable 
  
        System.out.println("Enter second number: "); // Asking user for input
        num2 = input.nextInt(); // Storing the user input in num1 variable 

        int divide = num1 / num2; // Division operation
        System.out.println("Output: "+divide); // Output result for division 
        } 

        catch(ArithmeticException e){ // Built-in class for exception handling
            System.out.println("Invalid Operation"); // Invalid operation output
        }
    }
}
