package Practice_java_program;

public class Lap013_ReversString {
    public static void main(String[] args) {

        String st = "Welcome to noida";
        String rev_st = "";
        for(int i = st.length()-1;i>=0;i--){

            rev_st = rev_st + st.charAt(i);
        }
        System.out.println("revers string is : "+rev_st);


    }
}
