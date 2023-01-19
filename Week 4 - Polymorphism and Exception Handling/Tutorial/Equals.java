public class Equals {
    public static void main(String[] args){
        String S1 = "hello";
        String S2 = "hello";
        String S3 = "java";
        String S4 = "JAVA";
        System.out.println(S1.equals(S2)); // True because content and case is same
        System.out.println(S1.equals(S3)); // False because content is not same
        System.out.println(S3.equals(S4)); // False because case is not same
    }
}
