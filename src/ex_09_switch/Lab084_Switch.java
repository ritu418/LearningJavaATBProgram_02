package ex_09_switch;


//**Problem**

        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7, 1- Mon,
        // you will tell which day it is.



       // ---
                // Logic Building Formula

  //      **// Step 1 - Number one is using the Scanner class.
// Step 2 number two will be basically figuring out the expression and the day.
// Step 3- We will basically add step 3 as a rough logic.
// Step 4 - 4 is you will write the fix the logic and optimize.
// Step 5 - figure out the edge cases.


import java.util.Scanner;

public class Lab084_Switch {

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
                    break;
                case 3:
                    System.out.println("day is Wed");
                    break;
                case 4:
                    System.out.println("day is Thur");
                    break;
                case 5:
                    System.out.println("day is Fri");
                    break;
                case 6:
                    System.out.println("day is Sat");
                    break;
                case 7:
                    System.out.println("day is Sun");
                    break;
                default:
                    System.out.println("Enter the input from 1 to 10");
                    break;
            }

        }
        else {
            System.out.println("Invalid int has entered");
        }
        System.out.println("End the Program");
    }
}
