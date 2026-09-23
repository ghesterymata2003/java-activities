/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle_Rental_System;

/**
 *
 * @author Ymata
 */
public class Vehicleclass {
    
    static class Vehicle {

   private String vehicleId;
     private String brand;
      private String model;
       private int rentalDays;

        
   public Vehicle(String vehicleId, String brand, String model, int rentalDays) {
            this.vehicleId = vehicleId;
            this.brand = brand;
            this.model = model;
            this.rentalDays = rentalDays;
        }

        
        public String getVehicleId() {
            return vehicleId;
        }

    public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getRentalDays() {
            return rentalDays;
        }

       
        public double calculateRental() {
            return 0;
        }

        
   public String getVehicleType() {
            return "Vehicle";
        }

       
        public void displayRental() {
            System.out.println("===== VEHICLE RENTAL =====");
            System.out.println();

    System.out.println("Vehicle: " + getVehicleType());
       System.out.println();
         System.out.println("Brand: " + brand);
      System.out.println();
          System.out.println("Model: " + model);
            System.out.println();
            System.out.println("Rental Days: " + rentalDays);
            System.out.println();

            
       System.out.printf("Rental Cost: ₱%,.2f%n", calculateRental());

    System.out.println();
       System.out.println("------------------------------");
            System.out.println();
        }
    }
}
    

