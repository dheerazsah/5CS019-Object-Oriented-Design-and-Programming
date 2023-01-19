import java.util.Scanner;

public class isEmpty {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = obj.nextLine();

        if(input.isEmpty()){  
            System.out.println("The string is empty.");  
        }  
        else{  
            System.out.println("The string is not empty.");  
        }  
        //System.out.print(input.isEmpty()); // True if users give a empty
    }
}
