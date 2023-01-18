package Q3; // Creating a package Q3
import java.util.Scanner; // Importing Scanner that tells the compiler to use Scanner

public class PalindromeMain extends Palindrome { // Using concpet of inheritance
    private String text; // Declaring a variable named text

    public PalindromeMain(String text) { // Creating a constructor
        super(text); // Using super keyword
    }

    public void display() { // Method to display 
        this.text = super.getText();  
        if (!super.checkPalindrome()) { // Method call to check condtion 
            System.out.println( text + " is not a palindrome word"); // Output result
            return;
        }
        System.out.println(text + " is a palindrome word"); // Output result
        return;
    }

    public static void main(String[] args) { // Main method 
        System.out.print("\nPlease enter a word: "); // Asking user for input
        Scanner scanUserText = new Scanner(System.in);  // Creating an object for Scanner
        String word = scanUserText.next(); // Scanning user input and storing it in word varibale
        PalindromeMain palindrome = new PalindromeMain(word); // Creating an object for PalindromeMain class
        palindrome.display(); // Method call
        scanUserText.close(); // Method call 
    }
}
