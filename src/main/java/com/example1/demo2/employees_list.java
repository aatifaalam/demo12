package com.example1.demo2;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private int id;
    private String department;

    // Constructor to initialize Employee objects
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Getter method to display employee details
    public String getDetails() {
        return "Name: " + name + ", ID: " + id + ", Department: " + department;
    }
}

public class employees_list {
    private List<Employee> employees;

    // Constructor initializes the list of employees
    public employees_list() {
        employees = new ArrayList<>();
    }

    // Method to add employee to the list
    public void addEmployee(String name, int id, String department) {
        Employee emp = new Employee(name, id, department);
        employees.add(emp);
    }

    // Method to display all employees in the list
    public void displayEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp.getDetails());
        }
    }

    public static void main(String[] args) {
        employees_list empList = new employees_list();

        // Adding three employees to the list
        empList.addEmployee("Alice", 101, "HR");
        empList.addEmployee("Bob", 102, "Finance");
        empList.addEmployee("Charlie", 103, "Engineering");

        // Displaying the employee list
        empList.displayEmployees();
    }
}
