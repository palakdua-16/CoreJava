package src.oopsadv.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab02 {
    public static void main(String[] args) {
        List l1=new ArrayList();
        l1.add("apple");
        l1.add("mango");
        l1.add("orange");
        System.out.println(l1);
        l1.set(1,"pine");
        for(int i=1;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
    }
}
