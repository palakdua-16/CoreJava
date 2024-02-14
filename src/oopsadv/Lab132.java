package src.oopsadv;

public class Lab132
{
    public static void main(String[] args) {
        Bank b=new Bank();
        b.printDetails();
        Bank b2=new Bank("icici","002");
        b2.printDetails();
        Bank b3=new Bank("hdfc","003");
        b3.printDetails();
    }
}
