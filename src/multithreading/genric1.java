package src.multithreading;

public class genric1 {
    public static <DT> void M1(DT a)
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
       M1(5);
       M1("Palak");

    }
}
