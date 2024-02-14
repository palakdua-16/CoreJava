package src.basics_01;
//VARIBLES AND IDENTIFIERS ->
public class Lab002 {
    public static void main(String[] args) {
        byte age=127; //byte can store from -127 to 127
        System.out.println(age+1);
        short age2=128; //-327688 to 32768
        short Static=128;
        short Public=128;
                //capital public and static can be used as variable name but not small case
        short $=2;

        //$ can also be used
        //short _=5;
        //_ will give error as it is keyword
        System.out.println(age);
        System.out.println($);
        System.out.println(Static);

    }
}
