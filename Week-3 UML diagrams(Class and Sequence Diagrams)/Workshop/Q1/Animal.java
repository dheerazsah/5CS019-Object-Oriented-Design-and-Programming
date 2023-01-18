 public class Animal { // Creating a public class named Animal
  
    public void eat() { // Creating a method 
        System.out.println("Eats Food"); // Output display
    }
  
    public void walk() { // Creating a method
        System.out.println("Can Walk"); // Output display
    }

    public static void main(String[] args) { // Creating a main function
        Animal obj = new Animal();
        obj.eat(); // Eat method call
        obj.walk(); // Walk method call
       
      }
    }

