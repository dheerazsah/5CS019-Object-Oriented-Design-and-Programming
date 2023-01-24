package Q2; // Creating a package Q2
class Node {  // Creating a class
    String data; // Declaring the datatype of a variable
    Node next; // Declaring the datatype of a variable

    Node(String data) { // Declaring a class constructor 
        this.data = data; // Using this keyword to access the data 
        this.next = null; 
    }
}

class LinkedNode { // Creating a class
    Node head; // Declaring the node head 

    public void addFirst(String data) {// Creating a function  to add 
        Node newNode = new Node(data); // Creating a new object 
        if (head == null) { // Initializing if condition
            head = newNode;
            return; 
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() { // Creating a function to display
        if (head == null) {  // Initializing if condition
            System.out.println("List is empty!"); // Prints output
            return;
        }
        Node currNode = head;
        while (currNode != null) {// Initializing while loop 
            System.out.print(currNode.data + " -> "); // Prints output
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) { // Main function
        LinkedNode list = new LinkedNode(); // Creating object for linkednode
        list.addFirst("third"); // Accessing and initializing value for variables using list keyword
        list.addFirst("second"); // Accessing and initializing value for variables using list keyword
        list.addFirst("first"); // Accessing and initializing value for variables using list keyword
        list.printList(); 
    }
}