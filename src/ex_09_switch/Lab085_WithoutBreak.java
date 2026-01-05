package ex_09_switch;

import java.util.Scanner;

public class Lab085_WithoutBreak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("You need to take a user input and ask for the integer from 1 to 7.");
        if (sc.hasNextInt()) {
            int day = sc.nextInt();

            switch(day){

                case 1:
                    System.out.println("day is Mon");
                    break;
                case 2:
                    System.out.println("day is Tue");

                case 3:
                    System.out.println("day is Wed");

                case 4:
                    System.out.println("day is Thur");

                case 5:
                    System.out.println("day is Fri");

                case 6:
                    System.out.println("day is Sat");

                case 7:
                    System.out.println("day is Sun");

                default:
                    System.out.println("Enter the input from 1 to 10");

            }

        }
        else {
            System.out.println("Invalid int has entered");
        }
        System.out.println("End the Program");


    }
}
