package ex_14_Strings;

public class Lab_140_Fuction {
    public static void main(String[] args) {
        String s = "java".substring(2);
        System.out.println(s);
        String s1 = "ritu pal";

        char [] ch = s1.toCharArray();
        System.out.println(ch);
        boolean b = " ".isBlank();
        System.out.println(b);
        String s2 = "ab".repeat(3);
        System.out.println(s2);

        //------------------stringbuilder----

        StringBuilder sb = new StringBuilder("riturani");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.append("nanu");
        System.out.println(sb);
    }
}
