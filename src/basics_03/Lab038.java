package src.basics_03;

public class Lab038 {
    public static void main(String[] args) {
        int a=40;
        int b=50;
        int c=60;
        int max=a>b?((a>c)?a:c):((b>c)?b:c);
        System.out.println(max);
    }
}
