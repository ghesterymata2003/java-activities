/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Water_Bill_Management_System;

/**
 *
 * @author User
 */
public class WaterBillMain {
    
     public static void main(String[] args) {

        // WaterBill Object 1
        WaterBill customer1 = new WaterBill(
            "W-1001",
            "Maria Santos",
            "Residential",
            120,
            145
        );

        // WaterBill Object 2
        WaterBill customer2 = new WaterBill(
            "W-1002",
            "Juan Dela Cruz",
            "Residential",
            200,
            218
        );

        // WaterBill Object 3
        WaterBill customer3 = new WaterBill(
            "W-1003",
            "ABC Company",
            "Commercial",
            300,
            335
        );

        // Display all water bills
        customer1.displayBill();
        customer2.displayBill();
        customer3.displayBill();
    }
}
    

