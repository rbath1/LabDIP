package dip.lab3.student.solution1;
import java.util.Scanner;

/**
 *
 * @author Robert Bath
 * @version 1.00
 */
public class KeyboardInput implements MessageReaderStrategy {
    
    public String saveMessage(){
        System.out.print("Enter your message: ");
        
        Scanner input = new Scanner(System.in);
            return input.nextLine();
    }
    
}
