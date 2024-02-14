package src.oopsadv.inheritance;

public class Programming
{
    String author;
    int version;
    Programming()
    {
        System.out.println("Programm DC");
    }
    Programming(String author,int vers)
    {
        this.author=author;
        this.version=vers;
    }
    void Print()
    {
        System.out.println("Author////"+ author);
        System.out.println("Version///"+version);
    }
}
