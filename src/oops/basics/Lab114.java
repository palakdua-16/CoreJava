package src.oops.basics;

import java.util.Scanner;

public class Lab114 {
    public static void main(String[] args) {
        //TAKE ARRAY INPUT
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            System.out.println(a[i]);
        }
    }

}
