import java.util.*;


public class nestedTryCatch extends RuntimeException{
    
    public nestedTryCatch(){
        super("Invalid Weight");
    }
    public static void main(String[] args){
        try{
            try{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the weight: ");
                int weight = scanner.nextInt();
                scanner.close();
                if(weight<=0){
                    throw new weightException();
                }
                System.out.print("The weight is: "+weight);
            }
            catch (weightException e) {
                System.out.println("Input does not match\n" + e.getMessage());
            }
        }
        catch(InputMismatchException e){
            System.out.println("Weight is not a string variable");
        }
        
}
}



 