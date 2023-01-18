package Q2; // Creating a package Q2
public class Animal { // Creating a class named animal
    public String type; // Initializing variable with datatype
    public String breed; // Initializing variable with datatype

    public Animal(String type, String breed) { // Creating a constructor
        this.type = type; // Using this keyword
        this.breed = breed; // Using this keyword
    }

    public void getAnimal() {  // Method initialized
        System.out.println("Animal Type: " + type + "\nBreed: " + breed); // Displays output
    }
}