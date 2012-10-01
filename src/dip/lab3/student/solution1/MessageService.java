package dip.lab3.student.solution1;

/**
 *
 * @author Robert Bath
 * @version 1.00
 */
public class MessageService {
    private MessageReaderStrategy messageReader;
    private MessageRendererStrategy messageRenderer;
    private String message;
    
    public MessageService(MessageReaderStrategy mRead, MessageRendererStrategy mRender){
        this.messageReader = mRead;
        this.messageRenderer = mRender;
    }
    
    public void getMessage(){
       messageRenderer.renderMessage(message);
    }
    public void setMessage(){
        message = messageReader.saveMessage();
    }
}
