package src.oops.basics;

public class Lab102 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = add(10,20);
        System.out.println(c);
        Hello();
    }
    static int add(int a, int b)
    {
       return a+b;
    }
    static  int add(int a)
    {
        return a; //JVM WILL RUN ONLY WITH MATCHING ARGUMENTS COUNT OF ARGUMENTS //
        // IT WILL MATCH AND THEN RUN FUNCTION
    }
    static void Hello()
    {
        System.out.println("hi");
    }
}
