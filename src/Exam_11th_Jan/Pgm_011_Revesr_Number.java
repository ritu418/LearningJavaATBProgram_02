package Exam_11th_Jan;
//Write a Java program to reverse a given number using a do-while loop.
public class Pgm_011_Revesr_Number {
    public static void main(String[] args) {


        int n = 245;
        int rev = 0, rem;


        do {
            rem = n%10;
            rev = rev*10 +rem;

            n=n/10;


        } while (n != 0);
        System.out.println(rev);
    }
}
