package Practice_java_program.Stringss;

import java.util.Arrays;

public class Revers_Only_Chart {

    public static void main(String[] args) {
        String st = "Ri*&418Ra#@80iu89";

        System.out.println("Input string : "+st);


        int left =0;
        int right=st.length()-1;
        char[] ch = st.toCharArray();

        while(left<right) {

            if(!Character.isLetter(ch[left])) {
                left++;


            }
            else if(!Character.isLetter(ch[right])) {

                right--;


            }
            else {

                char temp = ch[left];

                ch[left] = ch[right];

                ch[right] = temp;

                left++;
                right--;
            }


        }

        System.out.println(Arrays.toString(ch));
        System.out.println(new String(ch));

    }



    }


