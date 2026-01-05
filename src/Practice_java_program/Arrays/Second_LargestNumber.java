package Practice_java_program.Arrays;

public class Second_LargestNumber {

   public static void main(String[] args) {

       int[] num = {12, 45, 23, 9, 10};
       int max = num[0];
       int second_max = num[1];

       if(num.length<2){
           System.out.println("Can not find out the second Lagrest Number");
       }

       for(int i=0;i<num.length-1;i++){

          if(num[i]>max){
              second_max = max;
              max = num[i];
          }
          else if (num[i]> second_max && num[i]!=max){

              second_max = num[i];

          }

       }
       System.out.println(second_max);

    }
}
