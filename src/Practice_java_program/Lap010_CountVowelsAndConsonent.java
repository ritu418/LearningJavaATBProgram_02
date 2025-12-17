package Practice_java_program;

public class Lap010_CountVowelsAndConsonent {

    public  static void main(String[] args) {

        String st = "welcome to Noida";
        st = st.toLowerCase();   // handle uppercase letters

        String vowels = "aeiou";
        int v_count = 0;
        int c_count = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch >= 'a' && ch <= 'z') {   // ignore spaces and symbols
                if (vowels.indexOf(ch) ==-1) {
                    v_count++;
                } else {
                    c_count++;
                }
            }


        }



        System.out.println(v_count);
        System.out.println(c_count);

    }
}
