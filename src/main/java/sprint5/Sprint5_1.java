package sprint5;

public class Sprint5_1 {


}

// Write your code here
abstract class Employee{
    protected String employeeID;
    public abstract String getFullInfo();
    public Employee(String employeeID) {
        this.employeeID = employeeID;
    };
}

class SalariedEmployee extends Employee{
    protected String socialSecurityNumber;
    public SalariedEmployee(String employeeID, String socialSecurityNumber){
        super(employeeID);
        //this.employeeID = employeeID;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getFullInfo(){
        return employeeID;
    }
}

class ContractEmployee extends Employee{
    protected String federalTaxIDMember;
    public ContractEmployee(String employeeID, String federalTaxIDMember){
        super(employeeID);
        //this.employeeID = employeeID;
        this.federalTaxIDMember = federalTaxIDMember;
    }
    public String getFullInfo(){
        return employeeID;
    }
}