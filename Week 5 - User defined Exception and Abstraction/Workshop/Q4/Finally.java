/* Try, catch, and finally keyword is implemented in this program. 
The try block is first executed. If an arithmetic error occurs while 
dividing a by b, the program moves to the catch block. The catch block
is not executed if no exception occurs. Finally, the finally block is run.
Whether or not there is an exception, the finally block is executed. */

package Q4; // Creating a package Q4

public class Finally { // Declaring a class named Finally
    public static void main(String[] args) { // Main function
        int ar[] = { 1, 2, 3, 4, 5 }; // Initializing the value in an array variable
        try { // Try/ catch to get the expected exception
            for (int i = 0; i < ar.length; i++) { // A for loop to access value in the array variable
                System.out.println(ar[i]); // Prints the output 
            }
        } catch (ArrayIndexOutOfBoundsException e) { // Catch to get the expected exception which is array index out of bound exception
            System.out.println("Array Index Out Of Bound!"); // Prints the error message
        } finally { // Using finally keyword
            System.out.println("Successfuly Compiled!"); // Prints the successfully compiled message 
        }
    }
}
