/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee_Payroll_System;

/**
 *
 * @author Ymata
 */
public class EmployeeMain {
    
     // Main method
    public static void main(String[] args) {

        // Employee Object 1
        Employee employee1 = new Employee(
            "E-001",
            "Pedro Cruz",
            "Programmer",
            45,
            250
        );

        // Employee Object 2
        Employee employee2 = new Employee(
            "E-002",
            "Maria Santos",
            "Designer",
            40,
            300
        );

        // Employee Object 3
        Employee employee3 = new Employee(
            "E-003",
            "Juan Dela Cruz",
            "Assistant",
            18,
            200
        );

        // Display payroll information
        employee1.displayPayroll();
        employee2.displayPayroll();
        employee3.displayPayroll();
    }
}


    
