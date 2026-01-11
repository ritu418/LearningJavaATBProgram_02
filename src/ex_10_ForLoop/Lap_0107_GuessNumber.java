package ex_10_ForLoop;

import java.util.Random;
import java.util.Scanner;

public class Lap_0107_GuessNumber {
   public static void main(String[] args) {

       Random randomNumber = new Random();

       Scanner sc = new Scanner(System.in);
       int  n = randomNumber.nextInt(100) +1;
       int attempts = 0;
       int Guess_Num=0;

       System.out.println("Guess the number between 1 and 100");


       while(true){
           if (!sc.hasNextInt()) {
               System.out.println("Invalid input! Please enter interger number only!");
               sc.next(); // Consume invalid token
               continue;
           }
           System.out.print("Enter the number: ");
           Guess_Num = sc.nextInt();
           attempts++;
           if(Guess_Num<n){
               System.out.println("Number is less then number");

           } else if (Guess_Num>n) {
               System.out.println("Number is more then number");
           }
           else {
               System.out.println("Number is correct");
               break;
           }

       }
       System.out.println("Attempts taken: " + attempts);
       System.out.println("Program is close");

    }
}
