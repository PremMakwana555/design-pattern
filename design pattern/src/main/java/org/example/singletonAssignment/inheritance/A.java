package org.example.singletonAssignment.inheritance;

public abstract class A {
    int age;
    String name;

    public String greeting(){
        return "Hello "+ name;
    }
    public String getClassName(){
        return "A";
    }
}
