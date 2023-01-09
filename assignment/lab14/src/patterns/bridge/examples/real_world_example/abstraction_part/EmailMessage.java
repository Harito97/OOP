package patterns.bridge.examples.real_world_example.abstraction_part;

import patterns.bridge.examples.real_world_example.implementation_part.MessageSender;

public class EmailMessage extends Message{
    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    public void send(){
        messageSender.sendMessage();
    }
}
