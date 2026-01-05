package Practice_java_program.Arrays;

public class Odd_Even_Arrya {

   public static void main(String[] args) {
       int[] num = {12, 45, 23, 9, 10};

       for (int i=0;i<=num.length-1;i++){

           if(num[i]%2 ==0){
               System.out.println("Number is Even :"+num[i]);
           }
           else {
               System.out.println("Number is Odd :" +num[i]);
           }
       }

    }
}
