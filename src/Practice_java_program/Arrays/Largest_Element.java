package Practice_java_program.Arrays;

import java.util.Arrays;

public class Largest_Element {
   public static void main(String[] args) {

       int[] num = {12, 45, 12, 45, 23, 9, 10};
      int Largest_element = num[0];

      for(int i=0;i<=num.length-1;i++){

          if(Largest_element <num[i]){

              Largest_element = num[i];


          }
      }
       System.out.println(Largest_element);

    }
}
