package Q5; // Creating a package Q5

class TestBike extends Bicycle { // Using concept of inheritance in TestBike class
    public static void main(String[] args) { // Main function
        // Bicycle obj1 = new Bicycle();
        // obj1.printInfo();

        MountainBike obj2 = new MountainBike(); // Creating object for mountainbike class
        obj2.printInfo(); // Method call for mountain bike

        RoadBike obj3 = new RoadBike(); // Creating object for class
        obj3.printInfo(); // method call for road bike
    }
}
