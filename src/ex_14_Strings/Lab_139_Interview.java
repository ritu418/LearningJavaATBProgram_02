package ex_14_Strings;

public class Lab_139_Interview {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";
        String s7 = "Hello";
        String s10 = "hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
        System.out.println(s1 == s2);// not equal
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s5));


    }
}
