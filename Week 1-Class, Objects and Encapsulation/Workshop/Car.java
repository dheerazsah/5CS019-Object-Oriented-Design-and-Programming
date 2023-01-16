import java.util.Scanner; // Imports the Scanner class which is defined inside utilities folder inside the java folder".
class Car {  // Creates a class named Car
    String brand; // Declare a variable named brand as datatype String
    String color;
    
    public Car(){  // Creates a constructor 
        this.brand = "Ford"; // Value assigned in variable

    }
    public void setBrand(String brand){ // Sets
    this.brand = brand;
    }
    
    public String getBrand() { // Creating a public Function 
        return brand; // returns brand 
    }
    
    public static void main (String[] args) { // Static function 

        Car vehicle = new Car(); // Creates a new object from class 
        String brand = vehicle.getBrand(); // Function call 
        System.out.println("Brand: " + brand); // Displays output
        
    }
}
