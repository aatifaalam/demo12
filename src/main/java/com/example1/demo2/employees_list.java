package com.example1.demo2;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int id;
    private String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getDetails() {
        return "Name: " + name + ", ID: " + id + ", Department: " + department;
    }
}

public class employees_list {
    private List<Employee> employees;

    public employees_list() {
        employees = new ArrayList<>();
    }

    public void addEmployee(String name, int id, String department) {
        Employee emp = new Employee(name, id, department);
        employees.add(emp);
    }

    public void displayEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp.getDetails());
        }
    }

    public static void main(String[] args) {
        employees_list empList = new employees_list();

        empList.addEmployee("Alice", 101, "HR");
        empList.addEmployee("Bob", 102, "Finance");
        empList.addEmployee("Charlie", 103, "Engineering");

        empList.displayEmployees();
    }
}
