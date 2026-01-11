package Exam_11th_Jan;
//Write a Java program to print all even numbers between 1 and 50 using a do-while loop.
public class Pgm_10_EvenNumber {
    public static void main(String[] args) {

        int n = 1;

        do {


            if(n%2==0){

                System.out.println(" "+n);
            }
n++;

        } while (n <= 50);
    }
}