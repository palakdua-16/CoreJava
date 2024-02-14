package src.basics_03;

import javax.sound.midi.Soundbank;

public class Lab021 {
    public static void main(String[] args) {
        //Relational operator Interview question
        System.out.println(10==10);
        System.out.println(10>=10);
        System.out.println(10<=10);
        System.out.println(10>10);
        System.out.println(10<10);
        //System.out.println('A'=65);//it assignment  is not allowed
        System.out.println('A'==65); //ascii value of 'A'
        byte b=65;
        System.out.println('A'==b); //returns true
        System.out.println('A'==65.0); //property of java
        System.out.println('A'==65.0f); //property of java
        System.out.println('A'==65.0000); //property of java
        //System.out.println(true==0); //not possible
        //System.out.println(true >= true);


    }
}
