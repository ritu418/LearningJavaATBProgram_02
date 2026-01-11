package Exam_11th_Jan;
//Write a Java program to print numbers from 1 to 10, but
// stop the loop when the number becomes 5 using the break statement.
public class Pgm_012_number {

    public static void main(String[] args) {


        int n =1;

        while(n<=10){
            System.out.println(n);
            if(n==5){
                break;
            }
           n++;
        }
    }
}
