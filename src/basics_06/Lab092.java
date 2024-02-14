package src.basics_06;

public class Lab092 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={1,2,3,4,5};
        System.out.println(arr1==arr2); //address is different same as strings
        int arr3[]=arr1;
        System.out.println(arr3==arr1); //equal returns true as arr3 is pointing to same location
        System.out.println(arr1.equals(arr2));//in case of arrays it return false we dont compare values as
        // in strings .equals compares values

        arr3[0]=78;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);
    }
}
