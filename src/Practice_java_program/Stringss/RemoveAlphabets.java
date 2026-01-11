package Practice_java_program.Stringss;

public class RemoveAlphabets {
    public static void main(String[] args) {

        String st = "ri&%uwed*&pal@#";
        String new_st = " ";
        new_st =st.replaceAll("[A-Za-z0-9]","");
        System.out.println(new_st);



    }
}
