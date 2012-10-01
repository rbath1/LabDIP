package dip.lab3.student.solution1;
import java.util.Scanner;

/**
 *
 * @author Robert Bath
 * @version 1.01
 */
public class KeyboardInput implements MessageReaderInterface {
    
    public String saveMessage(){
        System.out.print("Enter your message: ");
        //Needs validation
        Scanner input = new Scanner(System.in);
            return input.nextLine();
    }
    
}
