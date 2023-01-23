package Q1; // Creating a package 
import java.util.LinkedList; // Importing linked list library

public class Student { // Creating a class named student 
    int id; // Declaring a variable 
    String name; // Declaring a variable 
    String address; // Declaring a variable 
    String gender; // Declaring a variable 
    public Student(int id, String name, String address, String gender) {  // Creating a class constructor 
        this.id = id; // Using this keyword to access the variable
        this.name = name; // Using this keyword to access the variable
        this.address = address; // Using this keyword to access the variable
        this.gender = gender; // Using this keyword to access the variable
    }

    String getName() { // A method to get name
        return name; // Returns the value of name 
    }
    
    int getID() { // A method to get ID
        return id; // Returns the value of ID
    }
}

class StudentRecord { // Creating a class named StudentRecord
    public static void main(String[] args) { // Main function
        LinkedList<Student> list = new LinkedList<Student>(); // Object for linkedlist 
        Student newObj = new Student(1, "Tyler", "Vinewood", "male"); // Creating object and passing value to variables 
        Student newObj2 = new Student(1, "Milton", "Groove Street", "male"); // Creating object and passing value to variables
        Student newObj3 = new Student(1, "Charlie", "Vespucci BLVD", "male"); // Creating object and passing value to variables
        list.add(newObj); //Object call
        list.add(newObj2); //Object call
        list.add(newObj3);//Object call
        for (Student listElement : list) { // Initializing for loop
            System.out.println("ID: " + listElement.getID()); // Expected output 
            System.out.println("Name: " + listElement.getName() + "\n\n"); // Expected output 
        }
    }
}