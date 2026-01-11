package Exam_11th_Jan;

import java.util.Scanner;

//Write a Java program to perform addition, subtraction,
// multiplication, or division based on user choice using a switch statement.
public class Pgm_07_SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num_1 = sc.nextInt();
        int num_2 = sc.nextInt();
        System.out.println("Choose the opretion :");
        System.out.println("Click 1 : Addition");
        System.out.println("Click 2 : Subtraction");
        System.out.println("Click 3 : Multiplication");
        System.out.println("Click 4 : Division");
        int op_num = sc.nextInt();
        switch (op_num){
            case 1:
                System.out.println(num_1+ num_2);
                break;
            case 2:
                System.out.println(num_1-num_2);
                break;
            case 3:
                System.out.println(num_1*num_2);
                break;
            case 4:
                System.out.println(num_1/num_2);
                break;
            default:
                System.out.println("Wrong operation");



        }


    }
}
