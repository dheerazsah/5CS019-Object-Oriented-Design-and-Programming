package Q2; // Creating a package for Q2    

class Child extends Parent { // Creates a subclass named Child that extends parent
    public void print(){ //Method to display with void returntype
        System.out.println("This is the child"); // Output for void method
    }

    public static void main(String[] args) { // Main method inside child class
        Child obj = new Child(); // Creating an object from child method  
        obj.print(); // Call method of parent class by object of parent class
        obj.display(); // Call method of parent class by object of child class 
        Parent p = new Parent(); // Creating an object from parent method
        p.display(); // Call method of child class by object of child class
       
    }
}