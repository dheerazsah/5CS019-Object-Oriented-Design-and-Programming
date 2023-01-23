public class Tenant { // Creating a class named Tenant that
    private String name; // Declaring a private variable with string datatype
    private int age; // Declaring a private variable with int datatype
    private String mobileNumber; // Declaring a private variable with string datatype
    private String address; // Declaring a private variable with string datatype
    private String dob; // Declaring a private variable with string datatype

    public Tenant(String name, int age, String mobileNumber, String address, String dob) { // Constuctor with parameter value 
        this.name = name; // Using this keyword for variable 
        this.age = age; // Using this keyword for variable 
        this.mobileNumber = mobileNumber; // Using this keyword for variable 
        this.address = address; // Using this keyword for variable 
        this.dob = dob; // Using this keyword for variable 
    }

    public String getName() { //Getting the value for name 
        return name;
    }
    
    public int getAge() { //Getting the value for age 
        return age;
    }

    public String getPhoneNumber() { //Getting the value for phone number 
        return mobileNumber;
    }

    public String getAddress() { //Getting the value for address
        return address;
    }

    public String getDOB() { //Getting the value for DOB
        return dob; 
    }
}
