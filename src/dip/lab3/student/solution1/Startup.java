package dip.lab3.student.solution1;


/**
 *
 * @author Robert Bath
 * @version 1.00
 */
public class Startup {
    public static void main(String[] args){
        MessageReaderStrategy KeyboardReader = new KeyboardInput();
        MessageRendererStrategy consoleWriter = new ConsoleOutput();
        
        MessageRendererStrategy guiWriter = new guiOutput();
        
        MessageService messageService = new MessageService(KeyboardReader, consoleWriter);
        MessageService messageService2 = new MessageService(KeyboardReader, guiWriter);

        messageService.setMessage();
        messageService.getMessage();
        
        messageService2.setMessage();
        messageService2.getMessage();
        
    }
}
