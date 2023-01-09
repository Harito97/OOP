package patterns.bridge.examples.real_world_example.abstraction_part;

import patterns.bridge.examples.real_world_example.implementation_part.MessageSender;

public abstract class Message {
    MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    abstract public void send();
}
