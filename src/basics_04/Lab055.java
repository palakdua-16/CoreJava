package src.basics_04;

import java.util.Scanner;

public class Lab055 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter browser");
        String browser=sc.next();
        switch(browser){
            case "chrome":
                System.out.println("chrome");
                break;
            case "mozilla":
                System.out.println("mozilla");
                break;

            default:
                System.out.println("none"); //if we use deault at start then break is imp

        }

    }
}
