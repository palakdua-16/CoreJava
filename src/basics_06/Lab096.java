package src.basics_06;

import java.util.Scanner;

public class Lab096 {
    public static void main(String[] args) {
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of first subjects");
        marks[0]=sc.nextInt();
        System.out.println("Enter the marks of 2 subjects");
        marks[1]=sc.nextInt();
        System.out.println("Enter the marks of 3 subjects");
        marks[2]=sc.nextInt();
        System.out.println("Enter the marks of 4 subjects");
        marks[3]=sc.nextInt();
        System.out.println("Enter the marks of 5 subjects");
        marks[4]=sc.nextInt();
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<30)
            {
                System.out.println("you are fail in this sunject"+ marks[i]);
            }
            System.out.println(marks[i]);
        }
    }
}
