package Practice_java_program;

public class Lap014_DuplicateString {
    public static void main(String[] args) {

        String st = "welcomeeewdfdd";
        String result = "";

        for(int i =0;i<=st.length()-1;i++){

            char ch = st.charAt(i);
            if(result.indexOf(ch)==-1){
                result = result + ch;

            }
        }

        System.out.println(result);
    }
}
