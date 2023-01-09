package patterns.bridge.examples.real_world_example.implementation_part;

public class TextMessageSender implements MessageSender{
    public void sendMessage(){
        System.out.println("TextMessageSender: Sending ... " +
                "\nCompleted");
    }
}
