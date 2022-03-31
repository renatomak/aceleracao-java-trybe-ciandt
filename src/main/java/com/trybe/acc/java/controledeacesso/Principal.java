package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    String menu = String.format("Entre com o número correspondente à opção desejada:\n"
        + "1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");

    ArrayList<Short> ages = new ArrayList<Short>();
//    ages.add((short) 16);
//    ages.add((short) 16);
//
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    ages.add((short) 25);
//    
//    ages.add((short) 55);
//    ages.add((short) 55);
//    ages.add((short) 55);

    

    short option = 0;
    do {
      System.out.println(menu);
      option = scan.nextShort();
      if (option == 1) {
        System.out.println("Entre com a sua idade:");
        short age = scan.nextShort();
        checkAge(age);
        ages.add(age);
      } else if (option == 2) {
        showReport(ages);
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    } while (option != 2);

    showReport(ages);

  }

  static void imprime(ArrayList<Short> ages) {
    for (short age : ages) {
      System.out.print(age);
    }
  }

  static void showReport(ArrayList<Short> ages) {
    int sizeAges = ages.size();

    int under18 = ages.stream().filter((age) -> age < 18).collect(Collectors.toList()).size();
    int adults =
        ages.stream().filter((age) -> age >= 18 && age <= 50).collect(Collectors.toList()).size();
    int over50 = ages.stream().filter((age) -> age > 50).collect(Collectors.toList()).size();


    System.out.println("----- Quantidade -----");
    System.out.println("menores: " + under18);
    System.out.println("adultas: " + adults);
    System.out.println("maiores que 50: " + over50);
    System.out.println("\n----- Percentual -----");
    System.out.println("menores: " + formattedPercentage(under18, sizeAges));
    System.out.println("adultas: " + formattedPercentage(adults, sizeAges));
    System.out.println("maiores que 50: " + formattedPercentage(over50, sizeAges));
    System.out.println("\nTOTAL: " + sizeAges);

  }

  static String formattedPercentage(int value, int size) {
    double percent = ((double) value / size) * 100.00;
    
    String percentStr = String.format("%.2f", percent);
    String subStr = percentStr.substring(percentStr.length()-2);
    
    if(subStr.compareTo("00") == 0) {
      return String.format(Locale.US, "%.1f", percent);
    }
    return String.format(Locale.US, "%.2f", percent);
  }

  static void checkAge(Short age) {
    if (age < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    } else if (age >= 18 && age < 50) {
      System.out.println("Pessoa adulta, catraca liberada!");
    } else if (age >= 50) {
      System.out.println("Pessoa adulta maior de 50, catraca liberada!");
    } else {
      System.out.println("Entre com uma opção válida!");
    }
  }
}
