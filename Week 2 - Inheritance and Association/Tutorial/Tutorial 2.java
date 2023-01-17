// Create a Main class
class Main{
    String brand; // Create a class attribute
    String name; // Create a class attribute
    
    // Create a class constructor for the Main class
    public Main(){
        name ="Ford";
    }
 
    public static void main (String[] args) {
        Main ford = new Main();  // Create an object of class Main (This will call the constructor)
        Main hyundai = new Main("Hyundai");
        System.out.println(ford.name); // Output
        System.out.println(hyundai.name); // Output
    }
}
