package Practice_java_program.Stringss;

public class Rev_CharNotWords {
    public static void main(String[] args) {
        String st = "Welcome to Noida";
        String rev_st = "";
        String [] new_st = st.split("");

        for(int i =0;i<=new_st.length-1;i++){

            String word = new_st[i];

            String rev_word = " ";
            for(int j =0;j<word.length()-1;j++){

                rev_word = rev_word + word.charAt(i);
            }
            System.out.println(rev_word);
rev_st = rev_st + rev_word + " ";
        }
        System.out.println(rev_st);
    }
}
