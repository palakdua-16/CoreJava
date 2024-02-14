package src.oops.basics;

public class Lab123 {
    public static void main(String[] args) {
        String s1="Palak";
        String s2= new String("Palak");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
