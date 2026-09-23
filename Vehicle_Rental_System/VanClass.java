/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle_Rental_System;

import Vehicle_Rental_System.Vehicleclass.Vehicle;

/**
 *
 * @author Ymata
 */
public class VanClass {
    
    static class Van extends Vehicle {

        public Van(String vehicleId, String brand, String model, int rentalDays) {
            super(vehicleId, brand, model, rentalDays);
        }

       
        @Override
   public double calculateRental() {

   double rentalCost = getRentalDays() * 2500;

            
            rentalCost = rentalCost + 1000;

            return rentalCost;
        }

        @Override
  public String getVehicleType() {
            return "Van";
        }
    }
    
}
