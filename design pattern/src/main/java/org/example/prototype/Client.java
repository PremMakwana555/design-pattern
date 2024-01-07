package org.example.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry reg){
        Student apprBatch = new Student();
        apprBatch.setBatch("April 2022");
        apprBatch.setAverageBatchPsp(89.0);
        reg.register("april21Batch", apprBatch);

        IntelligentStudent is = new IntelligentStudent();
        is.setBatch("April 21");
        is.setAverageBatchPsp(98.0);
        is.setIq(190);
        reg.register("april21IntelligentBatch",is);
    }
    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student raju = studentRegistry.get("april21Batch").clone();
        raju.setName("Raju");
        raju.setAge(23);
        raju.setPsp(93.0);

        Student prem = studentRegistry.get("april21IntelligentBatch").clone();
        prem.setName("Prem");
        prem.setAge(24);
        prem.setPsp(98);

        System.out.println("DEBUG");
    }
}
