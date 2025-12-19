package ex_01_Java_Basics;

import java.sql.SQLOutput;

class Ram{

    void shyam(){
        final int a=5;
        System.out.print("value of a : "+a);
    }
    void radha(){
        System.out.println("rekha shyam");
    }

}
class Ram2 extends Ram{

    void radha(){
        System.out.println("rekha");
    }
}



public class Abc {

   public static void main(String[] args) {
       int a= 4;
        Ram2 rm = new Ram2();
        rm.shyam();
        rm.radha();

    }

}
