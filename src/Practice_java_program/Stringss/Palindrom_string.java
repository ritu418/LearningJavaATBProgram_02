package Practice_java_program.Stringss;

public class Palindrom_string {
    public static void main(String[] args) {
        String st = "MADAM";
        String st_palin = st;
        String rev_st = "";
        for(int i=st.length()-1;i>=0;i--){

            rev_st = rev_st + st.charAt(i);
        }

        if(rev_st.equals(st_palin)){
            System.out.println("String is palindrom");
        }
        else {
            System.out.println("String is not palindrom");
        }
    }
}
