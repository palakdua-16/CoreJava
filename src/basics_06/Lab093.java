package src.basics_06;

public class Lab093 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        for(int i=0;i<arr1.length-1;i++)
        {
            System.out.println(arr1[i]);
        }
        int a=10;
        System.out.println(arr1); //it will print array reference(address)
        System.out.println(a);

    }
}
