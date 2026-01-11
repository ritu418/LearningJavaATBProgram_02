package ex_14_Strings;

public class Lab_135_Immutable {

    public static void main(String[] args) {
        String name = "Ritu";
        boolean result = name.contains("i");
        System.out.println(result);
       name= name.toUpperCase();
        System.out.println(name);
        name = name.concat("Rani");
        System.out.println(name);

    }
}
