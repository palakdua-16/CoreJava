package src.oopsadv;

public class BlockClass {
    BlockClass()
    {
        System.out.println("Default CONSTRUCTOR");
    }
    //Instance Initialisation Block
    {
        System.out.println("i am IIB");
    }
    //static initialisation block
    static {
        System.out.println("I am sib");
    }

}
