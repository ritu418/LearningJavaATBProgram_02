package Practice_java_program.Arrays;

public class Sum_Element {

    public static void main(String[] args) {
        int[] num = {12, 45, 12, 45, 23, 9, 10};
        int sum =0;

        for(int i =0;i<=num.length-1;i++){
            sum = sum + num[i];

        }
        System.out.println(sum);
    }
}
