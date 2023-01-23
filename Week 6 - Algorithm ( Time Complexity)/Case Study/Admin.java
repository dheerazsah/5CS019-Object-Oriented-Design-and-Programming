import java.util.Scanner; // Importing scanner to scan the user input
import java.util.LinkedList; // Importing Linkedlist that constructs an empty list.

public class Admin extends TmsUser { // Using concept of inheritance 
    public Admin(String username, String password) { // Constructor with parameter
        this.username = username; // Using this keyword for variable 
        this.password = password; // Using this keyword for variable 
    }

    public String getUsername() { // Getting the value for username 
        return username;
    }

    public String getPassword() { // Getting the value for password 
        return password;
    }

    public void login() { // Creating funtion login
        String name, mobileNumber, address, dob; // Declaring the variables
        int age, userID, chooseOption = 0; // Declaring the variables
        LinkedList<Tenant> list = new LinkedList<Tenant>(); // Tenant object 
        Scanner userObj = new Scanner(System.in); // Scanner object 
        do { // Giving the user to perform action 
            System.out.println("What do you want to do?");
            System.out.println("1. Add Tenant");
            System.out.println("2. Delete Tenant");
            System.out.println("3. Exit");
            System.out.print("\nChoose an option: ");
            chooseOption = Integer.parseInt(userObj.nextLine()); // Initializing a variable and then reading its data by user
            switch (chooseOption) { // Switch case for options
                case 1: // Case for adding tenant 
                    System.out.println("\nEnter the details of the tenant to be added\n"); // Displaying what to enter to the user
                    System.out.print("Enter the name: "); // Asking user to input data
                    name = userObj.nextLine(); // Stores the name in a variable
                    System.out.print("Enter the age: ");// Asking user to input data
                    age = Integer.parseInt(userObj.nextLine()); // Stores the age in a variable
                    System.out.print("Enter the phone number: "); // Asking user to input data
                    mobileNumber = userObj.nextLine(); // Stores the mobile number in a variable
                    System.out.print("Enter the address: "); // Asking user to input data
                    address = userObj.nextLine(); // Stores the address in a variable
                    System.out.print("Enter the Date of Birth: "); // Asking user to input data
                    dob = userObj.nextLine(); // Stores the dob in a variable
                    Tenant storeData = new Tenant(name, age, mobileNumber, address, dob); // Object for tenant 
                    list.add(storeData);  // Storing the data in a list 
                    System.out.println("Record added successfully!"); // Displays the success of data stored 
                    break;
                case 2: // Case for deleting tenant
                    System.out.print("Enter the id of the tenant: "); // Asking user to input data
                    userID = Integer.parseInt(userObj.nextLine()); // Stores the user id in a variable
                    if (list.isEmpty()) { // If condition for empty list 
                        System.out.println("The list is empty!"); // Displays the output for empty 
                    } else {
                        for (Tenant l : list) {
                            if (list.indexOf(l) == userID) { // Checks the user data 
                                list.remove(userID); // Removes the user data 
                                System.out.println("Successfully Removed ID: " + userID); // Displays the output result 
                            }
                        }
                    }
                    break;
                case 3:
                    userObj.close(); 
                    System.exit(0); // Exists the system 
                    break;
                case default: // Default case 
                    System.out.println("Something went wrong!"); // Displays the output for invalid output 
            }
        } while (chooseOption != 3);
    }
}