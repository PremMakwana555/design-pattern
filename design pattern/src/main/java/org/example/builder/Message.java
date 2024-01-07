package org.example.builder;

public class Message {

    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

//    public Message(MessageType messageType, String content, String sender, String recipient, boolean isDelivered, long timestamp) {
//        this.messageType = messageType;
//        this.content = content;
//        this.sender = sender;
//        this.recipient = recipient;
//        this.isDelivered = isDelivered;
//        this.timestamp = timestamp;
//    }


    public Message(MessageBuilder messageBuilder) {
        this.content = messageBuilder.getContent();
        this.messageType = messageBuilder.getMessageType();
        this.timestamp = messageBuilder.getTimestamp();
        this.sender = messageBuilder.getSender();
        this.isDelivered = messageBuilder.isDelivered();
        this.recipient = messageBuilder.getRecipient();
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

    public static MessageBuilder getBuilder() {
        return new MessageBuilder();
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageType=" + messageType +
                ", content='" + content + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", isDelivered=" + isDelivered +
                ", timestamp=" + timestamp +
                '}';
    }

    @WithBuilder
    static class MessageBuilder {
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
            return new Message(this);
        }
    }
}