package src.oopsadv.interview;

public class Abstract01 {

}
abstract class Person01{

    void  m1(){} //complete method
    abstract void m2(); //the method with abstract keyword is incomplete method// and someone has to complete it.

}
abstract class palak extends Person01
{
    void m2(){}
    abstract void m3();
}
class Palak2 extends palak  //ONLY CONCRETE(NORMAL WITHOUT ABSTRACT)CLASS CAN COMPLETE METHOD
{

    @Override
    void m2() {

    }

    @Override
    void m3() {

    }
}