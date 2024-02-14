package src.oopsadv;

public class Dog {
    String name;
    int age;
    Dog()
    {
        System.out.println("DC");
    }
    Dog(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void print()
    {
        System.out.println("Dog name"+name);
        System.out.println("Dog age"+ age);
    }
}

