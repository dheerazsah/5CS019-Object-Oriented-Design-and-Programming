package Q3; // Creating a package for Q3

class Square extends Rectangle { // Creates a subclass named Child that extends parent
    public void displaySqu(){ //Method to display with void returntype
        System.out.println("Square is a rectangle"); // Output for void method
    }
        public static void main(String[] args) { // Main Method to display output
            Square obj = new Square(); // Object for square class
            obj.displayShape(); // Call method
            obj.displayRect(); // Call method
          }
    }