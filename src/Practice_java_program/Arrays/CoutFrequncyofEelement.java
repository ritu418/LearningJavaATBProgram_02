package Practice_java_program.Arrays;

import java.util.HashMap;

public class CoutFrequncyofEelement {

    public static void main(String[] args) {


        int[] num = {12, 45, 12, 45, 23, 9, 10};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int n1 : num) {
            if (hm.containsKey(n1)){

                hm.put(n1,hm.get(n1)+1);

            } else {
                hm.put(n1,1);
            }
        }
        System.out.println(hm);

    }
}