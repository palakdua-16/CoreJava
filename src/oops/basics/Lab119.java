package src.oops.basics;

public class Lab119 {
    public static void main(String[] args) {
        String name = "Pramod"; // P r a m o d

        String y = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            y = y + name.charAt(i);
        }
        System.out.println(y);
    }
}
