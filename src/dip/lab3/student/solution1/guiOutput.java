package dip.lab3.student.solution1;
import javax.swing.JOptionPane;

/**
 *
 * @author Robert Bath
 * @version 1.00
 * 
 * @param message --passed from setMessage method in MessageService module
 */
public class guiOutput implements MessageRendererStrategy {
    public void renderMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
