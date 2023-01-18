package Q4; // Creating a package Q4

class PrimeNum { // Creating a class named PrimeNum
    private int number; // Declaring an integer

    public PrimeNum(int number){ // Creating a constructor
        this.number = number; // Using this keyword
    }

    public int getNumber(){ // Getting number using getter
        return number;
    }
    
    public void setNumber(int number){ // Setting number using setter
        this.number = number;
    }

    public boolean checkPrime(){ // Method to check prime number
        int range = number/2; 
        for(int i = 2; i < range; i++){ // Initiating for loop 
            if(number % i == 0){ // Using modulus to chedck if the remainder is zero 
                return false; /// Gives false result via boolean
            }
        }
        return true; // Gives true result 
    }
}