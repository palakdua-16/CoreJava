package src.oopsadv.ThrowsException;

public class CustomException extends Throwable {
    public CustomException(String msg){
        super(msg);
        System.out.println("If I got this, Custom Exp");
    }
}
