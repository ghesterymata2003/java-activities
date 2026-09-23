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
public class CarClass {
    
    static class Car extends Vehicle {

    public Car(String vehicleId, String brand, String model, int rentalDays) {
            super(vehicleId, brand, model, rentalDays);
        }

      
        @Override
   public double calculateRental() {

            double rentalCost = getRentalDays() * 1500;

           
     if (getRentalDays() >= 7) {
                rentalCost = rentalCost * 0.90;
            }

            return rentalCost;
        }

        @Override
        public String getVehicleType() {
            return "Car";
        }
    }
    
}
