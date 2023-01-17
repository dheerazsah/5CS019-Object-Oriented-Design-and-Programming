package Q1; // Creating a package for Q1
public class Student extends Person { // Inheriting data from Person class
    protected int age; // Initializing protected age variable
    
    public Student (String y,int age) {
        // added super constructor
       super(y);
      this.age = age; // Invoke current class constructor
    }
    
     public static void main(String[] args) { // Main method initialization
      Student obj = new Student("anish",50); // Object for Student class
      System.out.println(obj.name); // Call method and prints output
      System.out.println(obj.age); // Call method and prints output
    }
    
  }
  

  