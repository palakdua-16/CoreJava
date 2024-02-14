package src.oopsadv;

public class ATBPerson {
    String name; //instance variables;
    String email;
    int age;
   ATBPerson()
   {
       System.out.println("Default constructor");
   }


    ATBPerson(String valefromobj)
   {
       name=valefromobj;
       System.out.println(name);
   }
    void printDetails()
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);
    }
}
