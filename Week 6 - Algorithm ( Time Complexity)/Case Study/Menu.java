import java.util.Scanner; // Importing scanner to scan the user input

public class Menu { // Creating a class named Menu
    public static void main(String[] args) { // Main method 
        String username; // Declaring a variable 
        String password; // Declaring a variable 
        Admin admin = new Admin("admin", "admin"); // Creating an object for Admin
        Scanner userObj = new Scanner(System.in); // Object for scanner
        System.out.print("\nEnter username: "); // Asks the user to enter useraname
        username = userObj.nextLine(); // Initializing a variable and then reading its data by user
        System.out.print("Enter password: "); // Asks the user to enter password
        password = userObj.nextLine(); // Initializing a variable and then reading its data by user
        if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) { // If statement condition
            admin.login(); //Login function call
            userObj.close(); // Closes the userObj
            return;
        }
        System.out.println("Incorrect username or password. Please try again later!"); // Displays invalid output 
        userObj.close(); // Closes the userObj
    }
}
