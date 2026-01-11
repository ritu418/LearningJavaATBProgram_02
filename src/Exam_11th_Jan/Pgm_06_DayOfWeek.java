package Exam_11th_Jan;

import java.util.Scanner;

//Write a Java program to print the name of the day based on a number (1–7) using a switch statement.
public class Pgm_06_DayOfWeek {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int day_num = sc.nextInt();

        switch (day_num){

            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday ");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Wrong Number for the day");

        }


    }
}
