package com.tekwill.learning.basics.modifiers.software;

public class Employee {
    public String firstName;
    protected String protectedFirstName;
    private String privateFirstName;
    String defaultFirstName;
    private Employee employee;
    public void doWork() {
    }
    private void doPrivateWork(){

    }
    protected void doProtectedWork(){

    }
    void doDefaultWork(){

    }
    public void checkAccesModifiers(){
        firstName = "Sergiu";           //+++
        employee.firstName = "Sergiu";  //+++
        doWork();                       //+++
        employee.doWork();              //+++
        protectedFirstName = "Sergiu"; //+++
        employee.protectedFirstName = "Sergiu";  //+++
        doProtectedWork();              //+++
        employee.doProtectedWork();     //+++
        privateFirstName = "Sergiu"; //+++
        employee.privateFirstName = "Sergiu";   //+++
        doPrivateWork();            //+++
        employee.doPrivateWork();     //+++
        defaultFirstName = "Sergiu";   //+++
        employee.defaultFirstName = "Sergiu";  //+++
        doDefaultWork();          //+++
        employee.doDefaultWork();  //+++

    }
}
