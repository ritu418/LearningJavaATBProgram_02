package Practice_java_program;

import java.util.regex.Pattern;

public class Lap0016_EmailValid {

    public static void main(String[] args) {

        String Rexemail = "^[A-Za-z0-9+_.-] +@[A-Za-z0-9_.-]+$";
        String email = "ritu@gmail.com";

        Pattern pattern = Pattern.compile(Rexemail);


    }

}
