package src.basics_04;

import java.util.Scanner;

public class Lab053 {
    public static void main(String[] args) {
        //Triangle classifier //interview question
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter all 3 sides a,b,c");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         if(a==b && b==c && a==c)
         {
             System.out.println("Equaliteral");
         }
         else if(a==b || b==c || a==c)
         {
             System.out.println("Isoceles");
         }
         else
         {
             System.out.println("Scalene");
         }

    }
}
