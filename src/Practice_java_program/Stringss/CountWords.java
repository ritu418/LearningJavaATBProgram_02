package Practice_java_program.Stringss;

public class CountWords {

    public static void main(String[] args) {

        String st = "Hello students welcome to Noida";
        int count =1;
        for(int i =0;i<st.length()-1;i++){

           if(st.charAt(i)==' ' && st.charAt(i+1)!=' '){
               count =count +1;

           }

        }
        System.out.println(count);

    }
}
