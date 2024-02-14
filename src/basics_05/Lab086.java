package src.basics_05;

public class Lab086 {
    public static void main(String[] args) {
        int fact=1;
        int i=1;
        int n=5;
        while(i<=n)
        {
            fact=fact*i;
            i++;
        }
        System.out.println(fact);
    }
}
//FACTORIAL OF NUMBER