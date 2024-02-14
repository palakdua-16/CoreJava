package src.Practiceassignments;

import java.util.Scanner;

public class Lab001 {

        public static void main(String[] args) {

            //ASSIGNMENT TO FIND THE CUBROOT
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
