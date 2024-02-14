package src.Practiceassignments;

import java.util.Scanner;
//PRIMENUMBER CHECKER
public class Lab009 {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();
            int m;
            int flag=0;
            m=n/2;
            if(n==0|| n==1)
            {
                System.out.println("Not aprime number");
            }
            else{
                for(int i=2;i<=m;i++)
                {
                    if(n%i==0)
                    {
                        System.out.println("not a prime");
                        flag=1;
                        break;
                    }
                }
                if(flag==0)
                {
                    System.out.println("Prime number");
                }
            }

        }
    }
}
