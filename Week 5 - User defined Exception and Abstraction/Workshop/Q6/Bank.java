package Q6; // Creating a package Q6

public interface Bank{ // Declaring interface 
    double rateOfInterest(); // Declaring method 
}

class Nabil implements Bank { // Using the concept of implement in class Nabil
    public double rateOfInterest() { // Declaring method
        return 12.0; // Returns the rate of interest
    }
}

class Prabhu implements Bank { // Using the concept of implement in class Prabhu
    public double rateOfInterest() { // Declaring method
        return 11.0; // Returns the rate of interest
    }
}

class Test { // Creating a class named Test
    public static void main(String[] args) { // Main function
        Nabil bank1 = new Nabil(); // Creating an object bank1 for class Nabil
        Prabhu bank2 = new Prabhu(); // Creating an object bank1 for class Prabhu
        System.out.println(bank1.rateOfInterest()); // Displaying the output after method call
        System.out.println(bank2.rateOfInterest()); // Displaying the output after method call
    }
}

