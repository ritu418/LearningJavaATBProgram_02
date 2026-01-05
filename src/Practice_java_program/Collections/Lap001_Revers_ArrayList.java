package Practice_java_program.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Lap001_Revers_ArrayList {


   public static void main(String[] args) {


       ArrayList<String> list = new ArrayList<>();
       list.add("java");
       list.add("python");
       list.add("ritu");
       list.add("ritu");
       list.add("ritu");
        list.set(1,"shyam");
        list.add("");
       System.out.println(list.lastIndexOf("ritu"));
       System.out.println(list.size());
       System.out.println(list.contains("ritu"));
       System.out.println(list.isEmpty()? "list has not element" : "list has element");

//if(list.isEmpty()){
  //  System.out.println("list has not element");
//}
//else {
  //  System.out.println("list has element");
//}
       Collections.reverse(list);
       System.out.println(list);
   }

}
