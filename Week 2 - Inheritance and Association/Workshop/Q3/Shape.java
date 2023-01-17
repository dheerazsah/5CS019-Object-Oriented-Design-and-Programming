package Q3; // Creating a package for Q3
public class Shape {
    public void displayShape(){ //Method to display
        System.out.println("This is a shape"); // Output for display method
    }
    
}

class Rectangle extends Shape{
    public void displayRect(){ //Method to display
        System.out.println("This is a rectangular shape"); // Output for display method
    }

}

class Circle extends Shape{
    public void displayCirc(){ //Method to display
        System.out.println("This is a circular shape"); // Output for display method
    }
}

