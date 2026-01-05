package Practice_java_program.Stringss;

public class RemoveWiteSpace {
    public static void main(String[] args) {

        String st = "Hello to the java";
      st= st.replaceAll("\\s","");
        System.out.println(st);

    }
}
