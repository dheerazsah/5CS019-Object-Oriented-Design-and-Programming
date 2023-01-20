package Q5; // Creating a package Q5

public class RoadBike extends Bicycle { // Using concept of inheritance in RoadBike class
    int tireWidth; // Declaring varibale
    RoadBike(){ // Creating a constructor 
        tireWidth = 4; // set the initial value for the class attribute tire width
    }
    @Override // Method overriding
    public void printInfo() { // Method to print info
        System.out.println("Tire width of Bicycle: " + tireWidth); // Prints output 
    }
}
