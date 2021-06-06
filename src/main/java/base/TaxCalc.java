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
    return input.nextDouble();
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
