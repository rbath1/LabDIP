package dip.lab3.student.solution1;
/**
 *
 * @author Robert Bath
 * @version 1.00
 */
public class ConsoleOutput implements MessageRendererStrategy{
    public void renderMessage(String message){
        System.out.println("Message: ");
        System.out.println(message);
    }
    
}
