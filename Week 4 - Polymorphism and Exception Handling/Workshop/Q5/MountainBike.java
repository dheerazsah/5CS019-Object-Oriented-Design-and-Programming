package Q5; // Creating a package Q5

public class MountainBike extends Bicycle { // Using concept of inheritance in MountainBike class
    String suspension; // Declaring varibale
    public MountainBike() { // Creating a constructor 
        super(); // Using super keyword
        suspension = "Dual"; // set the initial value for the class attribute suspension
      }
    
    @Override // Method overriding
    public void printInfo(){ // Method to print info
        super.printInfo(); // Using super keyword
        System.out.println("Suspension of Bicycle: " + suspension); // Prints output 
    }
}
