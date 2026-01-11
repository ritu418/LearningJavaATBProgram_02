package Exam_11th_Jan;

import java.util.Scanner;

//Write a Java program to check whether a given number is positive, negative, or zero using the ternary operator.
public class Pgm_05_Possitive_Negative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();

        if(num<0){

            System.out.println("Number is Negative");
        } else if (num>0) {
            System.out.println("Number is Positive");
        }else {
            System.out.println("Number is Zero");
        }


    }
}
