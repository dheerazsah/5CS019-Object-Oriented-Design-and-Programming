package Q4; // Creating apackage Q4
import java.util.ArrayList; // Importing linked list library

public class AL { // Creating a class 
    public static void main(String[] args) { // Main function 
        ArrayList<String> name = new ArrayList<String>(); // Creating an object 
        name.add("Tyler Brown");  // Initializing the value
        System.out.println(name); // Gives output
        name.set(0, "array"); // Setting the name in index 0
        System.out.println(name); // Displays name
        name.remove(0); // Removes name
        System.out.println(name); // Displays output
    }
}
