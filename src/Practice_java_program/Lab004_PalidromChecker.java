package Practice_java_program;

import java.util.Scanner;

public class Lab004_PalidromChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string for checker :");
        String s = sc.next();
        String rev = "";
        for (int i = 0; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {

                System.out.println(i);
            }

        }


    }
}
