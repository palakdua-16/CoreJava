package src.oopsadv.interview;

public class I2 {
    public static void main(String[] args) {
        System.out.println(PP.a);
        PP f=new foo(); //Dynamic Dispatch //Grandfather
        A f1=new foo();  //father //Dynamic Dispatch
        foo f2=new foo();//son
        f.m1();
    }
}

    interface PP
    {
        int a=10;
        void m1();
    }
    abstract class A implements PP{
     abstract void add();
     //As this class implements PP it also contains method and int a mentioned in interface PP
}

class foo extends  A
{
    @Override
    public void m1() {

    }


    @Override
    void add() {

    }
}