package patterns.bridge.examples.real_world_example.abstraction_part;

import patterns.bridge.examples.real_world_example.implementation_part.MessageSender;

public class TextMessage extends Message{
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    public void send(){
        messageSender.sendMessage();
    }
}
