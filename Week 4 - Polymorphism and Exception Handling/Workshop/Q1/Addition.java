package Q1; // Creating a package Q1
public class Addition { // Creating a class named Addition

    public double add(double x, double y){ // Declaring a method that takes two integer parameters/ Overloaded add()
        return (x + y); // Adding two integer parameters
    }
    
    public int add(int x, int y) {  // Declaring a method that takes two integer parameters/ Overloaded add()
        return (x + y); // Adding two integer parameters
     } 
  
    public static void main(String args[]){ // Main method
        Addition obj = new Addition(); // Creating an object
        System.out.println(obj.add(10.5, 20.5)); // Output result 
        System.out.println(obj.add(10, 20)); // Output result
    }
}

