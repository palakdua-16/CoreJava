package src.oops.basics;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lab128 {
    public static void main(String[] args) {
        System.out.println("Enter a new String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean result = isPalindrome(str);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean isPalindrome(String str) {
        String original_str = str;
        StringBuilder sb = new StringBuilder(str);
        String reverse_string = sb.reverse().toString(); // domarP , naman
        return original_str.equalsIgnoreCase(reverse_string); // domarp == Pramod , true

        }
}
