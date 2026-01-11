package Exam_11th_Jan;

import java.sql.SQLOutput;
import java.util.Scanner;

//Write a Java program to check whether a given number is even or odd using arithmetic operators.
public class Pgm_02_Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
      while(num>0) {
          if (num % 2 == 0) {

              System.out.println("Number is even");
          } else {
              System.out.println("Number is odd");
          }
          break;
      }
    }
}
