package Q4; // Creating a package Q4
import java.util.Scanner; // Importing Scanner library to scan user input
import java.util.regex.Matcher; // Importing Regex library to scan user input
import java.util.regex.Pattern; // Importing Regex library to scan user input

public class Email { // Initializing a class named Email
    public static void main(String[] args) { // Main function
        Scanner obj = new Scanner(System.in); // Initializing an object for scanner
        System.out.println("Enter a word"); // Asking user to enter input 
        String input = obj.nextLine();  // Storing the user input in input variable 
        obj.close(); // Closing scanner fucntion
        
        Pattern pattern = Pattern.compile("@"); // Creating an object pattern 
        Matcher matcher = pattern.matcher(input); // Creating an object matcher
        boolean matchFound = matcher.find(); 
        if(matchFound){ // If condition for match found
            System.out.println("Email entered"); // Prints output
        }
        else{ // else condition for match invalid
            System.out.println("Please enter valid email using @"); // Prints output
        }
    }
}
