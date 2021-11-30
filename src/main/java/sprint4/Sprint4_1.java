package sprint4;

public class Sprint4_1 {

    class Employee{
        public String fullName;
        public float salary;
    }
    public void Employee(){
        // Create an instances of Employee class and use they here
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.fullName = "full name1";
        emp1.salary = 23;
        emp2.fullName = "full name2";
        emp2.salary = 46;
        Employee employees[] = {emp1, emp2};
        String employeesInfo="";

        for(int i=0; i<employees.length; i++){
            employeesInfo = employeesInfo + "{fullName: \"" + employees[i].fullName + "\", salary: " + employees[i].salary + "}";
            if(i==0){
                employeesInfo = employeesInfo+", ";
            }
        }

        System.out.println(employeesInfo = "["+employeesInfo+"]");
    }
    public static void main(String[] args){
        Sprint4_1 sp = new Sprint4_1();
        sp.Employee();
    }
}
