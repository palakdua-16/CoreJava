package src.basics_04;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter charcater");
        char ch=sc.next().toCharArray()[0];
        switch(ch)
        {
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }

    }
}
