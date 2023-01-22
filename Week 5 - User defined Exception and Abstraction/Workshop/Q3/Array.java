package Q3; // Creating a package Q3

public class Array {  // Creating a public class
    public static void main(String[] args) { // Main fucntion 
        int array[] = { 1, 2, 3, 4, 5 }; // Initializing the value in an array variable
        try { // Try/ catch to get the expected exception
            for (int i = 0; i <= array.length; i++) { // A for loop to access value in the array variable
                System.out.println(array[i]); // Prints the output 
            }
        } catch (ArrayIndexOutOfBoundsException e) { // Catch to get the expected exception which is array index out of bound exception
            System.out.println("Array Index Out Of Bound!"); // Prints the error message
        }
    }
}

