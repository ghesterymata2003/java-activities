/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Internet_Subscription_Management_System;

/**
 *
 * @author Ymata
 */
public class Internet {

   
    static class InternetPlan {

        
   private String planCode;
     private String customerName;
   private double monthlyFee;
     private int monthsSubscribed;

        
    public InternetPlan(String planCode, String customerName,
                double monthlyFee, int monthsSubscribed) {
       this.planCode = planCode;
         this.customerName = customerName;
        this.monthlyFee = monthlyFee;
     this.monthsSubscribed = monthsSubscribed;
        }

       
    public String getPlanCode() {
            return planCode;
        }

     public String getCustomerName() {
            return customerName;
        }

    public double getMonthlyFee() {
            return monthlyFee;
        }

    public int getMonthsSubscribed() {
            return monthsSubscribed;
        }

        
     public void setPlanCode(String planCode) {
            this.planCode = planCode;
        }

    public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

    public void setMonthlyFee(double monthlyFee) {
            this.monthlyFee = monthlyFee;
        }

    public void setMonthsSubscribed(int monthsSubscribed) {
            this.monthsSubscribed = monthsSubscribed;
        }

       
      public double calculateMonthlyBill() {
            return monthlyFee;
        }

   public String getSpeed() {
            return "0 Mbps";
        }

    public String getPlanDescription() {
            return "Internet Plan";
        }

   public String getDiscount() {
            return "0%";
        }

        
   public String getClassification() {
        if (monthsSubscribed >= 12) {
          return "LONG-TERM SUBSCRIBER";
       } else {
     return "REGULAR SUBSCRIBER";
            }
        }

        
   public void displayPlan() {
      System.out.println("===== INTERNET SUBSCRIPTION =====");
     System.out.println();

       System.out.println("Customer: " + customerName);
        System.out.println();

      System.out.println("Plan: " + getPlanDescription());
       System.out.println();

     System.out.println("Speed: " + getSpeed());
            System.out.println();

            System.out.printf("Monthly Fee: ₱%,.2f%n", monthlyFee);
            System.out.println();

     System.out.println("Months Subscribed: " + monthsSubscribed);
            System.out.println();

            System.out.println("Discount: " + getDiscount());
            System.out.println();

            
     System.out.printf("Monthly Bill: ₱%,.2f%n", calculateMonthlyBill());
            System.out.println();

      System.out.println("Classification: " + getClassification());

      System.out.println();
     System.out.println("------------------------------");
    System.out.println();
        }
    }
}