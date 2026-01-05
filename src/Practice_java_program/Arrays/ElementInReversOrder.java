package Practice_java_program.Arrays;

import java.util.Arrays;

public class ElementInReversOrder {

    public static void main(String[] args) {

        int[] num = {12, 45, 12, 45, 23, 9, 10};
        int[] rev_arr = new int[num.length];
        int index =0;

        for(int i=num.length-1;i>=0;i--){
            rev_arr[index] = num[i];
            index++;


        }
        System.out.println("Sorted Array : " + Arrays.toString(rev_arr));

    }
}
