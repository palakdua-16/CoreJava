package src.basics_04;

import java.util.Scanner;
//ASSIGNMENT1
public class Lab064 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of x,y,z");
        double x=sc.nextInt();
        double y=sc.nextInt();
        double z=sc.nextInt();
        double result;
         result=Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println(result);
    }
}
