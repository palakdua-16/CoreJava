package src.oopsadv;

public class Bank {
    String bname;
    String bcode;
    int balance;

    Bank()
    {
        bname="sbi";
        bcode="sbi001";
        System.out.println("Default Constructor");
    }
    Bank(String bname,String bcode)
    {
        this.bname=bname;
        this.bcode=bcode;
    }
    void printDetails()
    {
        System.out.println("Bankname--->" + bname);
        System.out.println("Bankcode--->" + bcode);
        System.out.println("Balance--->" + balance);

    }
}
