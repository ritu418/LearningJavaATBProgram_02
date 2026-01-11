package Exam_11th_Jan;

import java.util.Scanner;

//Write a Java program to convert a double value into an int using explicit type casting and print both values.
public class Pgm_03_TypeCasting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        double num = sc.nextDouble();

        int num2 = (int) num;

        System.out.println("Converted double value into integer :" +num2);



    }
}
