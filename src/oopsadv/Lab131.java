package src.oopsadv;

public class Lab131
{
    public static void main(String[] args) {
        ATBPerson p=new ATBPerson();
        ATBPerson p2=new ATBPerson("Palak");
        p2.printDetails();
        String name = p.name;
        p.printDetails();
        String s; //Local variable default value is never assigned by JVM
        //System.out.println(s);
    }
}
