package src.basics_04;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        //GRADE CALCULATOR
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();

        if(marks>=90 && marks<=100)
        {
            System.out.println("A");
        }
        else if(marks>=80 && marks<=89)
        {
            System.out.println("B");
        }
        else if(marks>=70 && marks<=79)
        {
            System.out.println("C");
        }
        else if(marks>=60 && marks<=69)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }

    }
}
