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
class StandardPlan extends InternetPlan {

    public StandardPlan(String planCode, String customerName,
                            int monthsSubscribed) {

      super(planCode, customerName, 1499, monthsSubscribed);
        }

        
        @Override
   public double calculateMonthlyBill() {

            double bill = getMonthlyFee();

            if (getMonthsSubscribed() >= 12) {
                bill = bill * 0.90;
            }

            return bill;
        }

        
        @Override
   public String getSpeed() {
            return "100 Mbps";
        }

       
        @Override
        public String getPlanDescription() {
            return "Standard";
        }

        @Override
        public String getDiscount() {
   if (getMonthsSubscribed() >= 12) {
                return "10%";
            }

            return "0%";
        }
    }
