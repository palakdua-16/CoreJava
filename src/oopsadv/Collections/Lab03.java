package src.oopsadv.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab03 {
    public static void main(String[] args) {
       // List l1=new l1(); //not possible
        List <String> l2=new ArrayList<>();//restrict only String

        for(Object o :l2)
        {
            System.out.println(o);
        }
    }
}
