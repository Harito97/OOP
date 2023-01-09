package patterns.bridge.examples.real_world_example;

import patterns.bridge.examples.real_world_example.abstraction_part.Message;
import patterns.bridge.examples.real_world_example.abstraction_part.TextMessage;
import patterns.bridge.examples.real_world_example.implementation_part.EmailMessageSender;
import patterns.bridge.examples.real_world_example.implementation_part.MessageSender;
import patterns.bridge.examples.real_world_example.implementation_part.TextMessageSender;

public class Client {
    public static void main(String[] args) throws Exception{
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new TextMessage(emailMessageSender);
        emailMessage.send();
    }
}
