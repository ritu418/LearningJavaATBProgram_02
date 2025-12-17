package Practice_java_program;

import java.util.Scanner;

public class Lab002_TableUsingSystemPrintf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for table :");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            int n1 = n * i;

            System.out.println(n + " X " + i + " = " + n1);

        }
    }
}