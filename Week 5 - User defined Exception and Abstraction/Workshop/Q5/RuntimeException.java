package Q5; // Creating a package Q5

class Invalid extends RuntimeException {  // Using the concept of inheritance 
    public Invalid() { // Creating a constructor
        super("You are not eligible to vote in the election!"); // Using super keyword to display unelidigible message 
    }
}
