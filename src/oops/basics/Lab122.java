package src.oops.basics;

public class Lab122 {
    public static void main(String[] args) {
        String expected_pass="Pass@1234";
        String actual_result="pass@1234";
        if(expected_pass==actual_result)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        if(expected_pass.equalsIgnoreCase(actual_result))
        {
            System.out.println("yes");
        }
    }
}
