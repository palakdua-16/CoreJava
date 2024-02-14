package src.basics_04;

public class Lab060 {
    public static void main(String[] args) {
        int itemcode=147;
        switch(itemcode)
        {
            case 001,002,003:
                System.out.println("Electronic gadget");
            case 004,005:
                System.out.println("mechanical");
            default:
                System.out.println("software product");
        }
    }
}
