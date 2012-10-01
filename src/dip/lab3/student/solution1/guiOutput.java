package dip.lab3.student.solution1;
import javax.swing.JOptionPane;

/**
 *
 * @author Robert Bath
 * @version 1.01
 * 
 * @param message --passed from setMessage method in MessageService module
 */
public class guiOutput implements MessageRendererInterface {
    public void renderMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
