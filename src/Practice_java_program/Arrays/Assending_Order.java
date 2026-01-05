package Practice_java_program.Arrays;

import java.util.Arrays;

public class Assending_Order {

    public static void main(String[] args) {

        int[] num = {12, 45, 12, 45, 23, 9, 10};

        for(int i=0;i<=num.length-1;i++){
            for(int j=i+1;j<=num.length-1;j++){

                if(num[i]>=num[j]){

                  int temp = num[j];
                  num[j] = num[i];
                  num[i] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(num));


    }
}
