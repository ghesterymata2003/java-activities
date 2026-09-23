/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internet_Subscription_Management_System;

import Internet_Subscription_Management_System.Internet.InternetPlan;

/**
 *
 * @author Ymata
 */
public class InternetMain {
    
    public static void main(String[] args) {

        
    InternetPlan[] plans = {
   new BasicPlan("B-001", "Juan Dela Cruz", 8),
       new StandardPlan("S-001", "Ana Reyes", 12),
         new PremiumPlan("P-001", "Maria Santos", 15)
        };
     
    for (InternetPlan plan : plans) {
  plan.displayPlan();
        }
    }
}
    

