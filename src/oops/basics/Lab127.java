package src.oops.basics;

public class Lab127 {
    public static void main(String[] args) {
        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Pramod");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
