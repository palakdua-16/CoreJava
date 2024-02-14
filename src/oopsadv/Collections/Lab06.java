package src.oopsadv.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab06 {
    public static void main(String[] args) {
        List<String> courseList = new ArrayList<>();
        courseList.add("ATB");
        courseList.add("CDE");
        courseList.add("FGH");
        courseList.add("IJK");

        ListIterator it2 =courseList.listIterator(courseList.size());
        while(it2.hasNext())
        {
            System.out.println(it2.hasNext());
        }

        ListIterator it =courseList.listIterator(courseList.size());
        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }
    }
}
