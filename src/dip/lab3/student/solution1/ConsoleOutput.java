package dip.lab3.student.solution1;
/**
 *
 * @author Robert Bath
 * @version 1.01
 * 
 * @param message --passed from setMessage method in MessageService module
 */
public class ConsoleOutput implements MessageRendererInterface{
    public void renderMessage(String message){
        System.out.println("Message: ");
        System.out.println(message);
    }
    
}
