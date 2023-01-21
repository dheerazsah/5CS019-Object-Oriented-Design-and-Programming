/* An abstract method is defined without any implementation (no braces, no semicolon).
To declare the class as abstract, use the keyword 'abstract'. The abstract class, as the
name implies, cannot be instantiated because it is incomplete. As a result, class B is 
instantiable, whereas class A is not. */

abstract class A { // Creating an abstract class
    void display() { // Method to display output
        System.out.println("Hello World"); // Expected output result
    }
}

class B extends A { // Using concpet of inheritance 
    public static void main(String[] args) { // Main function
        B dispobj = new B(); // Creating an object for class
        dispobj.display(); // Method call to display
    }
}


