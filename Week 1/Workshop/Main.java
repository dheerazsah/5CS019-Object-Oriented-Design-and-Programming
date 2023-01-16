package Package;

public class Main {
    public static void main(String[] main){
        // create an object of Data
        Data d = new Data();
        // access private variable and field from another class
        d.name = "Program";
        System.out.println(d.name);
    }
}
