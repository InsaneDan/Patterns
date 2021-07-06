package Composite.Employees;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int employeeID;
    private List<Employee> subordinates;

    public Employee(String name,String dept, int employeeID) {
        this.name = name;
        this.dept = dept;
        this.employeeID = employeeID;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return String.format("Employee name: %s, department: %s, ID: %s]",  name, dept, employeeID);
    }
}
