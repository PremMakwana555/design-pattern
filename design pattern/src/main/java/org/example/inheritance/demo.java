package org.example.inheritance;

public interface demo {
    int val = 20;
    int temp = 20;
    public default void giveResult(){
        System.out.println("Eerere");
    }
    public default void giveAnotherResult(){
        System.out.println("rere");
    }

}
