package ex_02_Trinaguler;


//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides,
// determine if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle.

import java.util.Scanner;

public class Trianguler_classifier {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1");
        int s1 = sc.nextInt();
        System.out.println("Enter the side2");
        int s2 = sc.nextInt();
        System.out.println("Enter the side 3");
        int s3 = sc.nextInt();

        if(s1==s2 && s2==s3 && s1 ==s3){
            System.out.println("Given input is for triangle");


        } else if ((s1 == s2 && s2 != s3 )||(s2 ==s3 && s1 != s2 ) ||(s1 == s3 && s1 !=s2)) {
            System.out.println("Given input is isosceles ");

        }
        else {
            System.out.println("scalene");
        }

    }

}
