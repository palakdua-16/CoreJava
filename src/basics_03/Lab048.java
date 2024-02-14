package src.basics_03;
import java.util.Scanner;
public class Lab048 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      if(a%2==1)
      {
          System.out.println("odd");
      }
      else
      {
          System.out.println("even");
      }


      /*
      // Take three input from user and give max out of two number
        // a,b  a>b -> a, else b

        Scanner sc = new Scanner(System.in); // OOps
        System.out.println("Enter the a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Max is " + a);
        } else {
            System.out.println("Max is " + b);
        }
        // concatenation - combine two or more things
       */
    }
}
