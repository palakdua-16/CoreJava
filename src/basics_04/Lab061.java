package src.basics_04;

public class Lab061 {
    public static void main(String[] args) {
        //jdk>13
        int item=100;
        switch (item)
        {
            case 001,002,003-> System.out.println("Electronic gadget");
            case 004,005-> System.out.println("mechanical");
            default-> System.out.println("software product");
        }
    }
}
