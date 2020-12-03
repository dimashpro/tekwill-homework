package md.modifiers.software;

public class Meeting {
    private Employee employee;
    public void checkAccesModifiers(){
       // firstName = "Sergiu";           //---
        employee.firstName = "Sergiu";  //+++
        // doWork();                       //---
        employee.doWork();              //+++
        //inheritedAccesFirstName = "Sergiu"; //---
        employee.inheritedAccesFirstName = "Sergiu";  //+++
        //doProtectedWork();              //---
        employee.doProtectedWork();     //+++
        //limitedAccesFirstName = "Sergiu"; //---
        //employee.limitedAccesFirstName = "Sergiu";   //---
       // doPrivateWork();            //---
       // employee.doPrivateWork();     //---
    }
}
