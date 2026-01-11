package Exam_11th_Jan;

import java.util.Scanner;

//Write a Java program to print the month name based on the month number (1–12) using a switch statement.
public class Pgm_08_MonthName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Month Number :");
        int num = sc.nextInt();


        switch (num){

            case 1 :
                System.out.println("Month name Jan");
                break;
            case 2:
                System.out.println("Month name Feb");
                break;
            case 3:
                System.out.println("Month name March");
                break;
            case 4:
                System.out.println("Month name April");
                break;
            case 5:
                System.out.println("Month name May");
                break;
            case 6:
                System.out.println("Month name Jun");
                break;
            case 7:
                System.out.println("Month name July");
                break;
            case 8 :
                System.out.println("Month name August");
                break;
            case 9:
                System.out.println("Month name Sept");
                break;
            case 10:
                System.out.println("Month name Oct");
                break;
            case 11:
                System.out.println("Month name Nov");
                break;
            case 12:
                System.out.println("Month name Dec");
                break;
            default:
                System.out.println("Enterd wrong month number");
        }

    }
}
