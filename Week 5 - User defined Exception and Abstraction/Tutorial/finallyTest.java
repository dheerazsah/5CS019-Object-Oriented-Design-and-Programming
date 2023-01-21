import java.util.Scanner;
import java.util.InputMismatchException;  

public class finallyTest{
    public static void main(String[] args){
        int num;
   
      try {
        Scanner input = new Scanner(System.in);
        // ask users to enter numbers
        System.out.println("Enter a number: ");
        num = input.nextInt();
      }
      catch (InputMismatchException e) { // Handles error for datatypes 
        System.out.println("Invalid.");
      }
      finally{
        System.out.println("Finally Test");
      }
}
}
