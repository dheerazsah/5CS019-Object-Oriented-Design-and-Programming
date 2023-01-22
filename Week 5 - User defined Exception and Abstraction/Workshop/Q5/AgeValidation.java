package Q5; // Creating a package Q5
import java.util.Scanner; // Importing scanner library to scan the user input

public class AgeValidation { //Declaring a public class 
    public static void main(String args[]) { // Main function
        Scanner scanUserInput = new Scanner(System.in); // Creating an object for scanning the user input
        System.out.print("Enter your age: "); // Asking user to input their age
        if (!scanUserInput.hasNextInt()) { // If condition to scan invalid integer
            System.out.println("Invalid integer."); // Prints the error message
            scanUserInput.close(); // Closing the scanner object
            return; // Returns the fucntion
        }
        int userAge = Integer.parseInt(scanUserInput.next()); // Initializing an integer variable to represent parseInt 
        try {
            if (userAge >= 18) { // If condition to check the applicable age i.e. 18 or greater than 18
                System.out.println("You are eligible to vote!"); // Prints output for uneligiblilty 
                scanUserInput.close(); // Closes the scanner object 
                return; // Returns the function
            }
            scanUserInput.close(); // Closes the scanner input
            throw new Invalid(); // Throws invalid 
        } catch (Invalid e) { // Catches the invalid data 
            System.out.println(e.getMessage()); // Prints the invalid message 
        }
    }
}

