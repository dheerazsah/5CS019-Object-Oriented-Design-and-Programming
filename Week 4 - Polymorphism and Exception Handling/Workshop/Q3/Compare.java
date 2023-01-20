package Q3; // Creating a package Q3
import java.util.Scanner; // Importing Scanner library to scan user input

public class Compare { // Creating a class named Compare
    public void ToCompare(){ // Declaring a method ToCompare
        Scanner obj = new Scanner(System.in); // Declaring an object named obj for scanner
        System.out.println("Enter a word"); // Asking user to enter input
        String input1 = obj.nextLine(); // Storing the user input in input1 variable 

        System.out.println("Enter another word"); // Asking user to enter input
        String input2 = obj.nextLine(); // Storing the user input in input2 variable 

        int result = input1.compareTo(input2); // Initializing an input to compare using in-built fucntion
        if (result > 0){ // If condtion for result greater than 0
            System.out.println(input2 + " comes before " + input1); // Prints output 
        }
        if (result < 0){ // If condtion for result smaller than 0
            System.out.println(input1 + " comes before " + input2); // Prints output 
        }
        if (result == 0){ // If condtion for result equals 0
            System.out.println(input2 + " is equals to " + input1); // Prints output
        }
    }
    public static void main(String args[]){ // Main method
        Compare obj = new Compare(); // Creating an object from class
        obj.ToCompare(); // Method Call
        }
                
}
