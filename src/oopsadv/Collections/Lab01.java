package src.oopsadv.Collections;

import java.util.List;

public class Lab01 {
    public static void main(String[] args) {
        List fruits=List.of("apple","orange","mango");
        System.out.println(fruits.get(0));
        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.indexOf("apple"));
    }
}
