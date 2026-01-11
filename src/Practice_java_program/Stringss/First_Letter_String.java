package Practice_java_program.Stringss;

public class First_Letter_String {

    public static void main(String[] args) {

        String st = "Hello world and welcome to noida";
        System.out.println(st.charAt(0) + " ");
        for(int i =0;i<=st.length()-1;i++){

            if(st.charAt(i)==' ' && st.charAt(i+1) !=' '){
                System.out.println(st.charAt(i+1) + " ");
            }
        }

    }

}
