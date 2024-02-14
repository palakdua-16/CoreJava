package src.oopsadv.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab05 {
    public static void main(String[] args) {
        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("CDE");
        courseList.add("FGH");
        courseList.add("IJK");
        List numList = new ArrayList<>();
        //List <Integer> numList=new ArrayList<>();
        numList.add(123);
        courseList.addAll(numList);
        Iterator iterator = courseList.iterator();
        while (iterator.hasNext()) {
            //courseList.add("456");//not allowed
            System.out.println(iterator.next());
        }
    }
}
