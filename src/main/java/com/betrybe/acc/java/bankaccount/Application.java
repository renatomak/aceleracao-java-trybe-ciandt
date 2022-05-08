package com.betrybe.acc.java.bankaccount;

import java.util.Scanner;

/**
 * A class.
 */
public class Application {

  /**
   * A simple get method.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    AccountNumberFormatter accountNumberFormatter = new AccountNumberFormatter();

    System.out.println("Informe o número da conta: ");
    int accountNumber = scanner.nextInt();

    String result = accountNumberFormatter.formatAccountNumber(accountNumber);
    
    System.out.println("Numero da conta: " + result);

    scanner.close();
  }

}
