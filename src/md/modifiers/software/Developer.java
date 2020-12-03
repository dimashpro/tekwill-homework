package md.modifiers.software;

public class Developer extends Employee {
    public void checkAccesModifiers(){
        firstName = "Sergiu";           //+++
        employee.firstName = "Sergiu";  //+++
        doWork();                       //+++
        employee.doWork();              //+++
        inheritedAccesFirstName = "Sergiu"; //+++
        employee.inheritedAccesFirstName = "Sergiu";  //+++
        doProtectedWork();              //+++
        employee.doProtectedWork();     //+++
       // limitedAccesFirstName = "Sergiu"; //---
       // employee.limitedAccesFirstName = "Sergiu";   //---
       // doPrivateWork();            //---
       // employee.doPrivateWork();     //---
    }
}
