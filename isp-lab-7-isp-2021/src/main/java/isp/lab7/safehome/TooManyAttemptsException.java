package isp.lab7.safehome;
import java.lang.Exception;
public class TooManyAttemptsException extends Exception{
    public TooManyAttemptsException(String message)
    {
        super(message);
    }
}
