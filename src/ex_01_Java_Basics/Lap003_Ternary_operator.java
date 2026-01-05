package ex_01_Java_Basics;

public class Lap003_Ternary_operator {
    public static void main(String[] args) {

 int a =10,b=30;
 int max = a>b ? a :b;
        System.out.println(max);

// even or odd
        int n = 24;

        String e_o = (n%2== 0)? "EVEN" : "ODD";

        System.out.println(e_o);
// pass or fail
         int marks = 25;

         String result = (marks>=30)? "PASS" : "FAIL";

        System.out.println(result);



    }
}
