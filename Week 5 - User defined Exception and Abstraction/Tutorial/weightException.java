import java.util.*;


public class weightException extends RuntimeException{
    
    public weightException(){
        super("Invalid Weight");
    }
    public static void main(String[] args){
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
}



 