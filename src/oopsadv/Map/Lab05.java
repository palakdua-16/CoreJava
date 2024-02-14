package src.oopsadv.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab05 {
    public static void main(String[] args) {
        Map m=new TreeMap<>();//doesnot allow diff data types

        //Map m=new HashMap();
        //Map m=new LinkedHashMap<>();
        m.put("name","palak");
        m.put(1,2);
        System.out.println(m);
    }
}
