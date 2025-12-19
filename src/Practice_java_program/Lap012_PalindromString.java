package Practice_java_program;

public class Lap012_PalindromString {

    public static void main(String[] args) {

        String st = "welcome";
        String rev_st = "";

        for (int i = st.length() - 1; i >= 0; i--) {
            rev_st = rev_st + st.charAt(i);

        }
        if (st.equals(rev_st)) {
            System.out.println("String is palindrom");


        } else {
            System.out.println("String is not palidrom");
        }


    }
}
