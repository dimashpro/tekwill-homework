package com.tekwill.learning.basics.modifiers.software;

public class Developer extends Employee {
    private Employee employee;

    public void checkAccesModifiers(){
        firstName = "Sergiu";           //+++
        employee.firstName = "Sergiu";  //+++
        doWork();                       //+++
        employee.doWork();              //+++
        protectedFirstName = "Sergiu"; //+++
        employee.protectedFirstName = "Sergiu";  //+++
        doProtectedWork();              //+++
        employee.doProtectedWork();     //+++
       // privateFirstName = "Sergiu"; //---
       // employee.privateFirstName = "Sergiu";   //---
       // doPrivateWork();            //---
       // employee.doPrivateWork();     //---
        defaultFirstName = "Sergiu";   //+++
        employee.defaultFirstName = "Sergiu";  //+++
        doDefaultWork();          //+++
         employee.doDefaultWork();  //+++
    }
}
