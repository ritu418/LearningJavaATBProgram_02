package Practice_java_program.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Lap002_ArList_practicesofInbuildMethod {

    public  static void main(String[] args) {

        ArrayList<Integer> n = new ArrayList<>();
        n.add(60);
        n.add(30);
        n.add(20);
        n.add(70);
        System.out.println("Values in list :"+n);
     //   Collections.sort(n);
        Collections.reverse(n);
        System.out.println("after reversd element in list : "+n);




    }

}
