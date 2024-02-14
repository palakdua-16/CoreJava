package src.oopsadv.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab09 {
    public static void main(String[] args) {
        List<Integer> myMakrs = new ArrayList<>();
        myMakrs.add(91);
        myMakrs.add(87);
        myMakrs.add(80);
        Collections.sort(myMakrs);
        System.out.println(myMakrs);
    }
}
