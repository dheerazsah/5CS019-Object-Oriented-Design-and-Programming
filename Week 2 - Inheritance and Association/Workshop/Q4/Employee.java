package Q4; // Creating a package for Q4
public class Employee extends Person{ // Inheriting data from Person class

    private int id; // initalizing variable 
    private double salary; // initalizing variable 
 
     public int getId() { //Getter method for ID
         return id;
     }
 
     public void setId(int id) { // Setter method for ID 
         this.id = id;
     }
 
     public double getSalary() { // Getter method for salary
         return salary;
     }
 
     public void setSalary(double salary) { // Setter method for salary 
         this.salary = salary;
     }
 
     public static void main(String[] args) { // Main fucntion rto display output
         Employee employee = new Employee(); // Creating object for employee
         employee.setAddress("Naxal"); // Call method add value in variable 
         employee.setName("Dhiraj"); // Call method add value in variable 
         employee.setId(1234); // Call method add value in variable 
         employee.setSalary(40000.00); // Call method add value in variable 
         System.out.println("Name: "+ employee.getName() + "\n"+  // Prints output
                 "Address: "+employee.getAddress()+ "\n" +
                 "Employee Id: "+ employee.getId()+" \n"+
                 "Employee Salary: "+ employee.getSalary());
     }
 }