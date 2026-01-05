package ex_09_switch;

import java.util.Scanner;

public class Lap087_Real_Switch_Automation {

    public static void main(String[] args) {

        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser Name");

        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser){

            case "chrome":
                System.out.println("welcome to chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "firefox":

                System.out.println("welcome to chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("I ahve no idea which browser it is");
                break;

        }


    }
}
