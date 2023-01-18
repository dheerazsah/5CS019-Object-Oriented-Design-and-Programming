package Q3; // Creating a package Q3
public class Palindrome { // Creating a class named palindrome
    private String text; // Declaring a variable named text

    public Palindrome(String text) { // Creating a constructor
        this.text = text; // Using this keyword for text
    }

    public String getText() { // Getter method to get the value
        return text;
    }

    public void setText(String text) { // Setter method to set value
        this.text = text; // Using this keyword for text
    }

    public boolean checkPalindrome() { // Creating a method to check the condition using boolean datatype
        int last = text.length()-1; // Declaring a variable last that stores last index of the string 
        String reverse = ""; // Declaring reverse as a empty string
        for (int i = last; i >= 0; i--) { // For loop that reverses the word in interation
            reverse = reverse + text.charAt(i); // Concating the reveresed words 
        }
        if (!reverse.equals(text)) { // If condition where reverse is checked 
            return false; // Returns false output if the word is not palindrome 
        }
        return true; // Returns true output if the word is palindrome
    }
}