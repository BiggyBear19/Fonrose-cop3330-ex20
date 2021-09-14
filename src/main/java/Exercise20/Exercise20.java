/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Bernard Fonrose
 */

package Exercise20;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {

        Scanner IRS =  new Scanner(System.in);

        System.out.print("Please enter the order amount: ");

        double raw_order = IRS.nextDouble();
        IRS.nextLine();

        double order = Math.round(raw_order * 100)/100.0;

        double rate;

        double tax = 0;

        double total = 0;

        System.out.print("What state are you currently in?");

        String state = IRS.nextLine();

        String Wisconsin  = "Wisconsin";

        if(Wisconsin.compareTo(state) == 0 ){

            System.out.print("What county do you live in? ");

            String county = IRS.nextLine();

            if(county.compareTo("Dunn") == 0) {

                rate = .054;

                tax = rate * order;

                total = tax + order;

            }

            if(county.compareTo("Eau Claire") == 0) {

                rate = .055;

                tax = rate * order;

                total = tax + order;

            }

            if(county.compareTo("Eau Claire") != 0 & county.compareTo("Dunn") != 0) {

                total = order;
            }


        }

        if(state.compareTo("Illinois") == 0) {
            rate = .08;

            tax = rate * order;

            total = tax + order;

        }

        if(Wisconsin.compareTo(state) != 0 & state.compareTo("Illinois") != 0){

            total = order;
        }

        System.out.printf("The Subtotal is $%f\nThe Tax is $%f\nThe Total is $%f", order, tax, total);
    }
}
