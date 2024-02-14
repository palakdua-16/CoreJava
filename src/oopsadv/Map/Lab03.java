package src.oopsadv.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab03 {
    public static void main(String[] args) {
        Map<String,Integer>  mq2=new HashMap<>();
        mq2.put("a",1);
        mq2.put("b",2);
        mq2.put("c",3);
        //Traversing through maps using for lopop
        for(Map.Entry<String,Integer> me:(mq2.entrySet()))
        {
            System.out.print(me.getKey() +":");
            System.out.println(me.getValue());
        }
    }
}
