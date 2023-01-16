public class Stud { // Creates a public class named Student
    String name; // Declare a variable wiith datatype String
    int rollNo, marksEng, marksMaths, marksSci, total; // Declaring multiple variable with datatype integer


public Stud(String name, int rollNo, int marksEng, int marksMaths, int marksSci){ // Creates a constructor 
    // Value assigned in variable
    this.name = name;
    this.rollNo = rollNo;
    this.marksEng = marksEng;
    this.marksMaths = marksMaths;
    this.marksSci = marksSci;
    this.total = marksEng + marksMaths + marksSci;
}

public int calcTotal() { // Creating a public function named calcTotal
    System.out.println("Total: " + total);
}

public static void main(String[] args) { 
    Stud student = new Stud("Ram", 12, 89, 87, 67);
    int total = student.calcTotal(); // Creates a new object from class 
    System.out.println(name);
    System.out.println(rollNo);
    System.out.println(marksEng);
    System.out.println(marksMaths);
    System.out.println(marksSci);
    System.out.println("Total: " + total); //Output
}
}

