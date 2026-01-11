package Exam_11th_Jan;

import java.util.Scanner;

//Maximum of Two Numbers
//
//Description:
//Write a Java program to find the maximum of two numbers using the ternary operator.
public class Pgm_04_Ternary_Operator {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number  ");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();

        if(num_1>num_2){
            System.out.println("Maximum Number is :  "+num_1);
        }else {
            System.out.println("Maximum Number is : "+num_2);
        }

    }

}
