package Exam_11th_Jan;

import java.util.Scanner;

//Write a Java program that takes two integer numbers and prints
// their sum, difference, multiplication, division, and remainder.
public class Pgm_01_Arithmetic {

    public static void main(String[] args) {

        Scanner sc_num = new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int sc_num_1 = sc_num.nextInt();
        System.out.println("Enter the Second Number");
        int sc_num_2 = sc_num.nextInt();
        int sum,difference,multiplication,division,remainder;
        sum = sc_num_1 +sc_num_2;
        System.out.println("Sum of two number : " +sum);
        difference = sc_num_1-sc_num_2;
        System.out.println("Differnce of the number : "+difference);
      multiplication = sc_num_1*sc_num_2;
        System.out.println("Multiplication of two number  : "+multiplication);
        division = sc_num_1/sc_num_2;
        System.out.println("Division of the Number : "+division);
        remainder = sc_num_1%sc_num_2;
        System.out.println("Remainder of the number : "+remainder);






    }

}
