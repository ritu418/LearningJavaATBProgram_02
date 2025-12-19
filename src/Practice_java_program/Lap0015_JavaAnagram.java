package Practice_java_program;

import java.util.Arrays;

public class Lap0015_JavaAnagram {

   public static void main(String[] args) {
        String st1 = "Slient";
        String st2 = "listen";

        st1 = st1.toLowerCase();
        st2= st2.toLowerCase();

        int st1_l1 = st1.length();
        int st2_l2 =st2.length();

        if(st1_l1 == st2_l2){
            char[] ch1 = st1.toCharArray();
            char [] ch2 = st2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1,ch2);
            if (result){
                System.out.println("String is anagram");
            } else {
                System.out.println("String is not anagram");
            }

        }
else{
            System.out.println("String is not anagram");
        }



    }
}
