package Practice_java_program.Stringss;

public class Revers_Strings {

    public static void main(String[] args) {

        String st = "Hello world ";
        String rev_st = "";
        for(int i=st.length()-1;i>=0;i--){

            rev_st = rev_st + st.charAt(i);
        }
        System.out.println(rev_st);
    }
}
