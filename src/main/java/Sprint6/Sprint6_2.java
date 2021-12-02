package Sprint6;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Sprint6_2 {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", 10, BigDecimal.valueOf(3000.00)));
        employees.add(new Manager("Petro", 9, BigDecimal.valueOf(3000.00), 1.5));
        employees.add(new Employee("Stepan", 8, BigDecimal.valueOf(4000.00)));
        employees.add(new Employee("Andriy", 7, BigDecimal.valueOf(3500.00)));
        employees.add(new Employee("Ihor", 5, BigDecimal.valueOf(4500.00)));
        employees.add(new Manager("Vasyl", 8, BigDecimal.valueOf(2000.00), 2.0));


    }
}
class Employee {
    // Code
    String name;
    int experience;
    BigDecimal basePayment;
    public Employee(String name, int experience, BigDecimal basePayment){
        this.name = name;
        this.experience = experience;
        this.basePayment = basePayment;
    }
    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public BigDecimal getBasePayment() {
        return basePayment;
    }

}
class Manager extends Employee {
    // Code
    double coefficient;
    public Manager(String name, int experience, BigDecimal basePayment, double coefficient){
        super(name, experience, basePayment);
        this.coefficient = coefficient;
    }
    @Override
    public BigDecimal getBasePayment(){
        BigDecimal res = basePayment.multiply(BigDecimal.valueOf(coefficient));
        return res;
    }
    
    @Override
    public int getExperience() {
        return experience;
    }
}
/*class MyUtils {
    public List<Employee> largestEmployees(List<Employee> workers) {
        // Code
        return workers;
    }
}*/
