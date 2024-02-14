package src.oopsadv.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab02 {
    public static void main(String[] args) {
        Map <Integer,String> mq = new HashMap<>();
        mq.put(1,"a");
        mq.put(2,"b");
        mq.put(3,"c");
        //mq.put("a","b"); //not possible
        System.out.println(mq.get(2));
        mq.put(null,"f");
        mq.put(null,"g"); //if we use 2 null values then last values will be printed
        System.out.println(mq);

    }
}
