import java.util.HashMap;
class Employee {
    String name;
    String department;

    // Constructor to initialize the employee details
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // To display employee details 
    public String toString() {
        return "Name: " + name + ", Department: " + department;
    }
}

public class Hashmap {

    public static void main(String[] args) {
        // Step 1: Create a HashMap to store employee details with employee ID as key
        HashMap<Integer, Employee> employeeMap = new HashMap<>();

        // Step 2: Add employee details to the HashMap
        employeeMap.put(101, new Employee("John Doe", "IT"));
        employeeMap.put(102, new Employee("Jane Smith", "HR"));
        employeeMap.put(103, new Employee("Sam Wilson", "Finance"));

        // Step 3: Retrieve and display employee details using their ID

        // Searching for an employee with ID 102
        int searchId = 102; // Employee ID to search
        Employee emp = employeeMap.get(searchId); // Get employee by ID

        // Display employee details if found
        if (emp != null) {
            System.out.println("Employee found: " + emp);
        } else {
            System.out.println("Employee not found with ID: " + searchId);
        }

    }
}
