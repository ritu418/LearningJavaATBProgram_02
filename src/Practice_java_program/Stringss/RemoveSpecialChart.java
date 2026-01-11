package Practice_java_program.Stringss;

public class RemoveSpecialChart {

    public static void main(String[] args) {

        String st = "ritu@wed!ju78@kj#";
String st1 = " ";
       st1 = st.replaceAll("[^A-Za-z0-9]","");
      //  new_st = st.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(st1);

    }
}
