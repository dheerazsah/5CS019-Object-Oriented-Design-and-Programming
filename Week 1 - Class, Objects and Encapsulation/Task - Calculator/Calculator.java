package C3; // Creating a package 
import java.util.Scanner; // tells the compiler to use Scanner

class Calculator { //creating main class calculator
    public static void main(String[] args) { // main method 
        Scanner scan = new Scanner(System.in); // creating a object scan 

        System.out.println("List of Operations: +, -, *, /, A"); // Display user the operations
        System.out.println("Add: +, Subtract: -, Multiply: *, Divide: /, Alphabatize: A");
        System.out.println("Enter an operation: "); // Asking user to enter their operation
        String operation = scan.nextLine(); // Reads the enter key after input 
    
        // For Addition
        if (operation.equals("+")) { // If statement to perform addition

            try { // Try and catch for exception handling
                System.out.print("Enter two integers: "); // Asking user for input
        
                int x = Integer.parseInt(scan.next()); // Initializing a variable and then reading its data by user
                int y = Integer.parseInt(scan.next()); // Initializing a variable and then reading its data by user
                int sum = x + y; // Intializing sum variable and then Operation for addition
    
                System.out.println(sum); // Output for addition
            } catch (NumberFormatException nfe) { // Exception handling
                System.out.println("Invalid Input Entered."); // Showing the output for exception
            }

        // For Substraction
        } else if (operation.equals("-")) { // If else statement to perform substraction
            
            try { // Try and catch for exception handling
                System.out.print("Enter two integers: "); // Asking user for input
                // since we are getting 2 integers at same time using space for separation,
                
                int x = Integer.parseInt(scan.next()); // Initializing a variable and then reading its data by user
                int y = Integer.parseInt(scan.next()); // Initializing a variable and then reading its data by user
                int sub = x - y; // Initializing sub variable and then operation for addition

                System.out.println(sub); // Output for substraction
            } catch (NumberFormatException nfe) { // Exception handling
                System.out.println("Invalid Input Entered."); // Showing the output for exception
            }
        }


        // For Multiplication
        else if (operation.equals("*")) { // If else statement to perform multiplication
            
            try { // Try and catch for exception handling
                System.out.print("Enter two doubles: "); // Asking user for input in datatype: double

                double x = Double.parseDouble(scan.next()); // Initializing a variable and then reading its data by user
                double y = Double.parseDouble(scan.next()); // Initializing a variable and then reading its data by user

                double mul = x * y; // Initializing mul variable and then operation for multiplication

                System.out.printf(" %.2f", mul); // Output for multiplication with formatting 2 
            } catch (NumberFormatException nfe) { // Exception handling
                System.out.println("Invalid Input Entered."); // Showing the output for exception
            }


            // For Division
        } else if (operation.equals("/")) { // If else statement to perform division
            
            try { // Try and catch for exception handling
                System.out.print("Enter two doubles: "); // Asking user for input in datatype: double
                
                double x = Double.parseDouble(scan.next()); // Initializing a variable and then reading its data by user
                double y = Double.parseDouble(scan.next()); // Initializing a variable and then reading its data by user
                
                if (y == 0) { // If case to check execption for infinity
                    System.out.println("Invalid Input Entered");
                }
                double div = x / y; // Initializing div variable and then operation for multiplication
                
                System.out.printf("%.2f", div); // Output for multiplication with formatting 2 
            } catch (NumberFormatException nfe) { // Exception handling
                System.out.println("Invalid Input Entered"); // Showing the output for exception
            }
        } 


 

        // For Alphabetize
        else if (operation.equals("A")) { // If else statement to perform alphabatize
        
            try { // Try and catch for exception handling
                System.out.print("Enter two strings: "); // Asking user for input in datatype: strings
                
                String[] input = new String[2]; // Getting 2 strings
                String x, y; // Initializing two variables to store string datatype
                input = scan.nextLine().split(" ");
                x = input[0];
                x = x.toLowerCase(); // Changing to lowercase to for error handeling

                y = input[1];
                y = y.toLowerCase(); // Changing to lowercase to for error handeling

                // Using compare to determine the alphabetical order for the strings
                if (x.compareTo(y) == 0) {
                    System.out.println("Answer: Chicken or Egg."); 
                } else if (x.compareTo(y) < 0) {
                    System.out.println("Answer: " + x + " comes before " + y); // Output result
                } else if (x.compareTo(y) > 0) {
                    System.out.println("Answer: " + y + " comes before " + x); // Output result 
                }
            } catch (ArrayIndexOutOfBoundsException aioobe) { // Exception handling
                System.out.println("Invalid Input Entered"); // Showing the output for exception

            }
        }

        else {
            System.out.println("Invalid Input Entered"); // Showing the output for exception
        }

    }

} 
