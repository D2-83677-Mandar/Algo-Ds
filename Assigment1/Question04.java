package com.sunbeam;

import java.util.Arrays;

class Employee {
	private int empId;
	private String name;
	private double salary;

	public Employee() {

	}

	public Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "empId=" + empId + ", name='" + name + '\'' + ", salary=" + salary + '}';
	}



}

public class Question04 {
	
	public static Employee searchById(Employee[] employees, int empId) {
		for (Employee employee : employees) {
			if (employee.getEmpId() == empId) {
				return employee;
			}
		}
		return null; 
	}


	public static Employee searchByName(Employee[] employees, String name) {
		for (Employee employee : employees) {
			if (employee.getName().equalsIgnoreCase(name)) {
				return employee;
			}
		}
		return null;
	}


	public static Employee[] searchBySalary(Employee[] employees, double salary) {
		Employee[] result = new Employee[employees.length];
		int count = 0;

		for (Employee employee : employees) {
			if (employee.getSalary() == salary) {
				result[count++] = employee;
			}
		}
		
		return Arrays.copyOf(result, count);
	}
	
	public static void main(String[] args) {
		
	
	
	Employee[] employees = {
            new Employee(101, "Arun", 5000),
            new Employee(102, "Babu", 6000),
            new Employee(103, "Chirag", 5500),
            new Employee(104, "Dhiraj", 6500),
            new Employee(105, "Alia", 5000) 
    };
	
	int searchEmpId = 103;
    String searchName = "Arun";
    double searchSalary = 5000;
    
    Employee empById = searchById(employees, searchEmpId);
    if (empById != null) {
        System.out.println("Employee found by empId " + searchEmpId + ": " + empById);
    } else {
        System.out.println("Employee with empId " + searchEmpId + " not found.");
    }

    Employee empByName = searchByName(employees, searchName);
    if (empByName != null) {
        System.out.println("Employee found by name " + searchName + ": " + empByName);
    } else {
        System.out.println("Employee with name " + searchName + " not found.");
    }


    Employee[] empBySalary = searchBySalary(employees, searchSalary);
    if (empBySalary.length > 0) {
        System.out.println("Employees found with salary " + searchSalary + ": ");
        for (Employee emp : empBySalary) {
            System.out.println(emp);
        }
    } else {
        System.out.println("No employees found with salary " + searchSalary);
    }
    
}
}

