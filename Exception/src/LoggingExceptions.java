import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by ust on 2015/12/27.
 */
class LoggingException extends  Exception{
    private static Logger logger = Logger.getLogger(LoggingException.class.getName());

    public LoggingException(){
        StringWriter trace = new StringWriter();

        printStackTrace(new PrintWriter(trace));
        logger.severe("T "+trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try {
            throw  new LoggingException();
        }catch (Exception e){
            System.err.println("caught : "+e);
        }

        try{
            throw  new LoggingException();
        }catch (Exception e){
            System.err.println("caught : "+e);
        }
    }

}

