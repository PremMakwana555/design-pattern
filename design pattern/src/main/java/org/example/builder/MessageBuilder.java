package org.example.builder;

@WithBuilder
public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    public MessageBuilder setMessageType(MessageType messageType) {
        this.messageType = messageType;
        return this;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public MessageBuilder setContent(String content) {
        this.content = content;
        return this;
    }

    public MessageBuilder setSender(String sender) {
        this.sender = sender;
        return this;
    }

    public MessageBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    public MessageBuilder setDelivered(boolean delivered) {
        isDelivered = delivered;
        return this;
    }

    public MessageBuilder setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public Message build(){
//        return new Message(this);
        return null;
    }
}