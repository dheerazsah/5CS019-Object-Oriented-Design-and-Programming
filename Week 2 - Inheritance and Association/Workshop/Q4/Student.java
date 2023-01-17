package Q4; // Creating a package for Q2
public class Student extends Person{ // Inheriting data from Person class
    private String studentCode; // initalizing variable 
    private char grade; // initalizing variable  

    public String getStudentCode() { //Getter method for student code
        return studentCode;
    }

    public void setStudentCode(String studentCode) { //Setter method for stduent code
        this.studentCode = studentCode;
    }

    public char getGrade() { // Getter method for grade
        return grade;
    }

    public void setGrade(char grade) { // Set method for grade 
        this.grade = grade;
    }

    public static void main(String[] args) { // Main fucntion rto display output
        Student student = new Student(); // Object for student class
        student.setAddress("Naxal"); // Call method add value in variable 
        student.setName("Dhiraj"); // Call method add value in variable 
        student.setStudentCode("Java"); // Call method add value in variable 
        student.setGrade('A'); // Call method add value in variable 
        System.out.println("Name: "+ student.getName() + "\n"+  // Prints output
                "Address: "+student.getAddress()+ "\n" +
                "Student code: "+ student.getStudentCode()+" \n"+
                "Student grade: "+ student.getGrade());
    }
}