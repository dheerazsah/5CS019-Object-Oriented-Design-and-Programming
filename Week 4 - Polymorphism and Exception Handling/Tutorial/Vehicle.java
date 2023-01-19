// The Car class extends the Vehicle class and overrides the display() method
public class Vehicle {

    // Display the main class. This method is called by the main class.
    public void display() {
        System.out.println("For main class");
    }
}

class Car extends Vehicle {
    // Display the display of this class.
    @Override
    public void display() {
        System.out.println("For sub class");
    }

    // Main method for the Car class.
    public static void main(String[] args) {
        Car obj = new Car();
        obj.display();
    }
}
