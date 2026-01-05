package Practice_java_program.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] num = {12, 45, 12, 45, 23, 9, 10};

        System.out.println("Duplicate Arrays");

        for (int i =0;i<= num.length-1;i++){

            for(int j =i+1;j<=num.length-1;j++){

                if(num[i]==num[j]){
                    System.out.println(num[i]);

                }
            }
        }

    }

}
