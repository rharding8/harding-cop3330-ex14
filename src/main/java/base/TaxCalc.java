/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

package base;

import java.util.Scanner;

public class TaxCalc {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    TaxCalc newTax = new TaxCalc();
    double total = newTax.initial();
    if (newTax.state().equalsIgnoreCase("WI")) {
      total = newTax.addTax(total);
    }
    System.out.printf("The total is $%.2f%n", total);
  }

  public double initial() {
    System.out.print("What is the order amount? ");
    String n = input.next();
    try {
      Double.parseDouble(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Amount! Try Again.");
      return initial();
    }
    return Double.parseDouble(n);
  }

  public String state() {
    System.out.print("What is the state? ");
    return input.next();
  }

  public double addTax(double subtotal) {
    double tax = subtotal * 0.055;
    System.out.printf("The subtotal is $%.2f.%nThe tax is $%.2f.%n", subtotal, tax);
    return subtotal + tax;
  }
}
