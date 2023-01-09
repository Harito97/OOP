package patterns.bridge.examples.real_world_example.implementation_part;

public class EmailMessageSender implements MessageSender{
    public void sendMessage(){
        System.out.println("EmailMessageSender: Sending ... " +
                "\nCompleted");
    }
}
