/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle_Rental_System;

import Vehicle_Rental_System.CarClass.Car;
import Vehicle_Rental_System.MotorcycleClass.Motorcycle;
import Vehicle_Rental_System.VanClass.Van;
import Vehicle_Rental_System.Vehicleclass.Vehicle;

/**
 *
 * @author Ymata
 */
public class main {
    
  public static void main(String[] args) {

        
        Vehicle[] vehicles = {
            new Car("C-001", "Toyota", "Vios", 7),
            new Motorcycle("M-001", "Honda", "Click 125", 3),
            new Van("V-001", "Toyota", "Hiace", 2)
        };

        
   for (Vehicle vehicle : vehicles) {
            vehicle.displayRental();
        }
    }
}
    

