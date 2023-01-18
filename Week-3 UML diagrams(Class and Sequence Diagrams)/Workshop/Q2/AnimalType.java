package Q2; // Creating a package Q2
public class AnimalType extends Animal { // Inheriting the data from Animal class

    public AnimalType(String type, String breed) { // Creating a constructor
        super(type, breed); // Using super key
    }
    public static void main(String[] arg){ // Main function
        AnimalType setAnimal = new AnimalType("Dog", "German Sephard"); // Creating an object
        setAnimal.getAnimal(); // Method Call
    }
}