package src.oopsadv.interview;

public class Lab146 {
    public static void main(String[] args) {
        System.out.println(I1.a);
         H1 h=new H1();
         h.m1();
    }
}
interface I1
{
    public static final int a=10;
    public static final int b=10;
    void m1();
}
class H1 implements  I1
{

    @Override
    public void m1() {

    }
}