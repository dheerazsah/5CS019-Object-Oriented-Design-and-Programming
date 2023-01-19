// The class is called Main, it has a main method, and the main method has a try-catch block
public class Main {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
            System.out.println(divideByZero);

        } catch (Exception e) {
            System.out.println("Invalid.");
        }
    }
}
