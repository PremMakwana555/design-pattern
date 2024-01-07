package org.example.builder;


public class Main {
    public static void main(String[] args) {

        Message message = Message.getBuilder()
                .setMessageType(MessageType.TEXT)
                .setContent("Watch Your TONE BOYYYY")
                .setDelivered(true)
                .setSender("Kratos")
                .setRecipient("Atreus (LOKI)")
                .setTimestamp(122L)
                .build();

        System.out.println(message);
    }
}
