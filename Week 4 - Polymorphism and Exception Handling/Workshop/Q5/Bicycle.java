package Q5; // Creating a package Q5

public class Bicycle { // Initializnig a class named Bicycle
    int gear, speed; // Declaring variables 
    public Bicycle() { // Creating a constructor for Bicycle clas
        gear = 3; // Set the initial value for the class attribute gear
        speed = 45; // Set the initial value for the class attribute speed
      }

    public void printInfo() { // Method to print info
        System.out.println("Gear of Bicycle: " + gear); // Prints ourtput for gear
        System.out.println("Speed of Bicycle " + speed); // Prints output for speed
    }

    public static void main(String[] args) { // Main function
        Bicycle obj1 = new Bicycle(); // Creating an object for Bicycle class
        obj1.printInfo(); // Method call
    }
}
