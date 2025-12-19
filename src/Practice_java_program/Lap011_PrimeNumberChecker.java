package Practice_java_program;

import java.util.Scanner;

public class Lap011_PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        boolean isnum = true;
if(num<=1){
    isnum = false;
}
else {
    for (int i = 2; i<=Math.sqrt(num); i++) {

        if (num % i == 0) {
            isnum = false;
            break;

        }
    }
}
        if (isnum) {
            System.out.println("Number is prime number ");
        } else {
            System.out.println("Number is not prime");
        }
    }
}