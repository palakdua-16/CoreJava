package src.oopsadv.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lab04 {
    public static void main(String[] args) {
        List<String> l1=new LinkedList<>();
        l1.add("apple");
        l1.add("apple");
        l1.add("mango");
        l1.add("orange");
        //forloop
        for(int i=1;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
        //foreach
        for(Object o:l1)
        {
            System.out.println(o);
        }
        Iterator iterate=l1.iterator();
        while(iterate.hasNext())
        {
            System.out.println(iterate.next());
        }

    }
}
