package src.basics_06;

public class Lab091 {
    public static void main(String[] args) {
        int [] marks={90,95,96,100};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        int a[]=new int[4];
        //a---->0  0 0 0 default value of int is 0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        a[0]=78;
        System.out.println(a[0]);
        System.out.println(a[5]); //java.lang.ArrayIndexOutOfBoundsException
        final int b1[] = new int[4];
        b1[0]=78;
        //final keyword is for length is fixed not for values of b1 array
        }
}
