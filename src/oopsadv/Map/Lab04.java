package src.oopsadv.Map;

import java.util.HashMap;

public class Lab04 {
    public static void main(String[] args) {
        HashMap <Integer,String>m =new HashMap<>();
        m.put(1,"a");
        m.put(2,"b");
        m.put(3,"c");
        System.out.println(m);
        m.remove(1);
        m.putIfAbsent(1,"g");
        m.remove(1,"c");
        System.out.println(m);

    }
}
