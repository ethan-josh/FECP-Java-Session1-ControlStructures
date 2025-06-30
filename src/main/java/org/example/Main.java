package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
Lab 2: Membership Calculator
Write a program in Java Program that calculates the price of a
membership based on the user's age and membership status.

The program should take two inputs from the user:
a string representing the user's membership status (which can be "Regular", "VIP", or "Premium"),
and an integer representing the user's age.
 */

/*
The program should then calculate the price of the membership based on the following rules:
If the user's membership status is "Regular", the price is $50 for users under 18, $100 for users aged 18 to 64, and $75 for users over 64.
If the user's membership status is "VIP", the price is $75 for users under 18, $150 for users aged 18 to 64, and $112.5 for users over 64.
If the user's membership status is "Premium", the price is $100 for users under 18, $200 for users aged 18 to 64, and $150 for users over 64.


Your program should output the calculated price of the membership as a floating-point number with two decimal places, using the following format:
"Price: $x.xx".
If the user enters an invalid membership status (i.e., a string other than "Regular", "VIP", or "Premium"),
your program should output the message "Invalid membership status entered." and terminate.

 */
public class Main {
    public static void main(String[] args) {
        // scanner object
        Scanner myObj = new Scanner(System.in);
        // Enter membership status
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String memberStatus = myObj.nextLine();
        memberStatus = memberStatus.toUpperCase();

        // Enter age
        System.out.print("Enter age: ");
        int ageOfMember = myObj.nextInt();

        float membershipPrice = 0.00f;
        switch(memberStatus){
            case "REGULAR":
                if (ageOfMember < 18){
                    membershipPrice = 50.0f;
                }else if (ageOfMember >= 18 && ageOfMember <= 64){
                    membershipPrice = 100.0f;
                }else{
                    membershipPrice = 75.0f;
                }
                System.out.printf("Price: $%.2f", membershipPrice);
                break;

            case "VIP":
                if (ageOfMember < 18){
                    membershipPrice = 75.0f;
                }else if (ageOfMember >= 18 && ageOfMember <= 64){
                    membershipPrice = 150.0f;
                }else{
                    membershipPrice = 112.5f;
                }
                System.out.printf("Price: $%.2f", membershipPrice);
                break;

            case "PREMIUM":
                if (ageOfMember < 18){
                    membershipPrice = 100.0f;
                }else if (ageOfMember >= 18 && ageOfMember <= 64){
                    membershipPrice = 200.0f;
                }else{
                    membershipPrice = 150.0f;
                }
                System.out.printf("Price: $%.2f", membershipPrice);
                break;
            default:
                System.out.println("Invalid membership status entered.");
        }






    }
}