package md.modifiers.software;

public class Employee {
    public String firstName;
    protected String inheritedAccesFirstName;
    private String limitedAccesFirstName;
    public Employee employee;
    public void doWork() {
    }
    private void doPrivateWork(){

    }
    protected void doProtectedWork(){

    }
    public void checkAccesModifiers(){
        firstName = "Sergiu";           //+++
        employee.firstName = "Sergiu";  //+++
        doWork();                       //+++
        employee.doWork();              //+++
        inheritedAccesFirstName = "Sergiu"; //+++
        employee.inheritedAccesFirstName = "Sergiu";  //+++
        doProtectedWork();              //+++
        employee.doProtectedWork();     //+++
        limitedAccesFirstName = "Sergiu"; //+++
        employee.limitedAccesFirstName = "Sergiu";   //+++
        doPrivateWork();            //+++
        employee.doPrivateWork();     //+++
    }
}
