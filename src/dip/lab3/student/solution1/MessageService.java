package dip.lab3.student.solution1;

/**
 *
 * @author Robert Bath
 * @version 1.01
 */
public class MessageService {
    private MessageReaderInterface messageReader;
    private MessageRendererInterface messageRenderer;
    private String message;
    
    public MessageService(MessageReaderInterface mRead, MessageRendererInterface mRender){
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
