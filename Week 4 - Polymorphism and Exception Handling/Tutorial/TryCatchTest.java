import java.util.Scanner;
import java.util.InputMismatchException;  

public class TryCatchTest {
    public static void main(String[] args){
        int num1, num2;
  
      // create an object of Scanner class
   
      try {
        Scanner input = new Scanner(System.in);
        // ask users to enter numbers
        System.out.println("Enter first number: ");
        num1 = input.nextInt();
  
        System.out.println("Enter second number: ");
        num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum is"+sum);

    } catch (InputMismatchException e) {
        System.out.println("Invalid.");
    }
    }
}
