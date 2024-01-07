package org.example.prototype;

import jdk.jshell.spi.SPIResolutionException;

public class Student implements Prototype<Student> {

    private String name;
    private String batch;
    private double psp;
    private double averageBatchPsp;
    private int age;
    //not getter for this
    private String internalState = "success";

    public Student(){
    }

    public Student(Student st){
        this.name = st.name;
        this.age = st.age;
        this.batch = st.batch;
        this.psp = st.psp;
        this.averageBatchPsp = st.averageBatchPsp;
        this.internalState = st.internalState;
    }

    @Override
    public Student clone() {
       return new Student(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
