package Practice_java_program.Arrays;

public class Smallest_Element {

   public static void main(String[] args) {


       int [] num = {24,23,19,12,45};
       int smallest_element = num[0];

       for(int i=0;i<=num.length-1;i++){

           for(int j= i+1;j<=num.length-1;j++);

           if(smallest_element>num[i]){
               smallest_element = num[i];


           }
       }

       System.out.println(smallest_element);
    }
}
