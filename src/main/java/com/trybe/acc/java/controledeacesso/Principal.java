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

    ArrayList<Integer> ages = new ArrayList<Integer>();

    int[] idades = { 49, 10, 53, 10, 49, 10, 54, 10, 49, 10, 55, 10, 49, 10, 56, 10, 49, 10, 57,
            10, 49, 10, 49, 48, 10, 49, 10, 49, 49, 10, 49, 10, 49, 50, 10, 49, 10, 49,
            51, 10, 49, 10, 49, 52, 10, 49, 10, 49, 53, 10, 49, 10, 49, 54, 10, 49, 10,
            49, 55, 10, 49, 10, 49, 56, 10, 49, 10, 49, 57, 10, 49, 10, 50, 48, 10, 49,
            10, 50, 49, 10, 49, 10, 50, 50, 10, 49, 10, 50, 51, 10, 49, 10, 50, 52, 10,
            49, 10, 50, 53, 10, 49, 10, 50, 54, 10, 49, 10, 50, 55, 10, 49, 10, 50, 56,
            10, 49, 10, 50, 57, 10, 49, 10, 51, 48, 10, 49, 10, 51, 49, 10, 49, 10, 51,
            50, 10, 49, 10, 51, 51, 10, 49, 10, 51, 52, 10, 49, 10, 51, 53, 10, 49, 10,
            51, 54, 10, 49, 10, 51, 55, 10, 49, 10, 51, 56, 10, 49, 10, 51, 57, 10, 49,
            10, 52, 48, 10, 49, 10, 52, 49, 10, 49, 10, 52, 50, 10, 49, 10, 52, 51, 10,
            49, 10, 52, 52, 10, 49, 10, 52, 53, 10, 49, 10, 52, 54, 10, 49, 10, 52, 55,
            10, 49, 10, 52, 56, 10, 49, 10, 52, 57, 10, 49, 10, 53, 48, 10, 49, 10, 53,
            49, 10, 49, 10, 53, 50, 10, 49, 10, 53, 51, 10, 49, 10, 53, 52, 10, 49, 10,
            53, 53, 10, 49, 10, 53, 54, 10, 49, 10, 53, 55, 10, 49, 10, 53, 56, 10, 49,
            10, 53, 57, 10, 49, 10, 54, 48, 10, 49, 10, 54, 49, 10, 49, 10, 54, 50, 10,
            49, 10, 54, 51, 10, 49, 10, 54, 52, 10, 49, 10, 54, 53, 10, 49, 10, 54, 54,
            10, 49, 10, 54, 55, 10, 49, 10, 54, 56, 10, 49, 10, 54, 57, 10, 49, 10, 55,
            48, 10, 49, 10, 55, 49, 10, 49, 10, 55, 50, 10, 49, 10, 55, 51, 10, 49, 10,
            55, 52, 10, 49, 10, 55, 53, 10, 49, 10, 55, 54, 10, 49, 10, 55, 55, 10, 49,
            10, 55, 56, 10, 49, 10, 55, 57, 10, 49, 10, 56, 48, 10, 49, 10, 56, 49, 10,
            49, 10, 56, 50, 10, 49, 10, 56, 51, 10, 49, 10, 56, 52, 10, 49, 10, 56, 53,
            10, 49, 10, 56, 54, 10, 49, 10, 56, 55, 10, 49, 10, 56, 56, 10, 49, 10, 56,
            57, 10, 49, 10, 57, 48, 10, 49, 10, 57, 49, 10, 49, 10, 57, 50, 10, 49, 10,
            57, 51, 10, 49, 10, 57, 52, 10, 49, 10, 57, 53, 10, 49, 10, 57, 54, 10, 49,
            10, 57, 55, 10, 49, 10, 57, 56, 10, 49, 10, 57, 57, 10, 49, 10, 49, 48, 48,
            10, 49, 10, 49, 48, 49, 10, 49, 10, 49, 48, 50, 10, 49, 10, 49, 48, 51, 10,
            49, 10, 49, 48, 52, 10, 49, 10, 49, 48, 53, 10, 49, 10, 49, 48, 54, 10, 49,
            10, 49, 48, 55, 10, 49, 10, 49, 48, 56, 10, 49, 10, 49, 48, 57, 10, 49, 10,
            49, 49, 48, 10, 49, 10, 49, 49, 49, 10, 49, 10, 49, 49, 50, 10, 49, 10, 49,
            49, 51, 10, 49, 10, 49, 49, 52, 10, 49, 10, 49, 49, 53, 10, 49, 10, 49, 49,
            54, 10, 49, 10, 49, 49, 55, 10, 49, 10, 49, 49, 56, 10, 49, 10, 49, 49, 57,
            10, 49, 10, 49, 50, 48, 10, 49, 10, 49, 50, 49, 10, 49, 10, 49, 50, 50, 10,
            49, 10, 49, 50, 51, 10, 49, 10, 49, 50, 52, 10, 49, 10, 49, 50, 53, 10, 49,
            10, 49, 50, 54, 10, 49, 10, 49, 50, 55, 10, 49, 10, 49, 50, 56, 10, 49, 10,
            49, 50, 57, 10, 49, 10, 49, 51, 48, 10, 49, 10, 49, 51, 49, 10, 49, 10, 49,
            51, 50, 10, 49, 10, 49, 51, 51, 10, 49, 10, 49, 51, 52, 10, 49, 10, 49, 51,
            53, 10, 49, 10, 49, 51, 54, 10, 49, 10, 49, 51, 55, 10, 49, 10, 49, 51, 56,
            10, 49, 10, 49, 51, 57, 10, 49, 10, 49, 52, 48, 10, 49, 10, 49, 52, 49, 10,
            49, 10, 49, 52, 50, 10, 49, 10, 49, 52, 51, 10, 49, 10, 49, 52, 52, 10, 49,
            10, 49, 52, 53, 10, 49, 10, 49, 52, 54, 10, 49, 10, 49, 52, 55, 10, 49, 10,
            49, 52, 56, 10, 49, 10, 49, 52, 57, 10, 49, 10, 49, 53, 48, 10, 49, 10, 49,
            53, 49, 10, 49, 10, 49, 53, 50, 10, 49, 10, 49, 53, 51, 10, 49, 10, 49, 53,
            52, 10, 49, 10, 49, 53, 53, 10, 49, 10, 49, 53, 54, 10, 49, 10, 49, 53, 55,
            10, 49, 10, 49, 53, 56, 10, 49, 10, 49, 53, 57, 10, 49, 10, 49, 54, 48, 10,
            49, 10, 49, 54, 49, 10, 49, 10, 49, 54, 50, 10, 49, 10, 49, 54, 51, 10, 49,
            10, 49, 54, 52, 10, 49, 10, 49, 54, 53, 10, 49, 10, 49, 54, 54, 10, 49, 10,
            49, 54, 55, 10, 49, 10, 49, 54, 56, 10, 49, 10, 49, 54, 57, 10, 49, 10, 49,
            55, 48, 10, 49, 10, 49, 55, 49, 10, 49, 10, 49, 55, 50, 10, 49, 10, 49, 55,
            51, 10, 49, 10, 49, 55, 52, 10, 49, 10, 49, 55, 53, 10, 49, 10, 49, 55, 54,
            10, 49, 10, 49, 55, 55, 10, 49, 10, 49, 55, 56, 10, 49, 10, 49, 55, 57, 10,
            49, 10, 49, 56, 48, 10, 49, 10, 49, 56, 49, 10, 49, 10, 49, 56, 50, 10, 49,
            10, 49, 56, 51, 10, 49, 10, 49, 56, 52, 10, 49, 10, 49, 56, 53, 10, 49, 10,
            49, 56, 54, 10, 49, 10, 49, 56, 55, 10, 49, 10, 49, 56, 56, 10, 49, 10, 49,
            56, 57, 10, 49, 10, 49, 57, 48, 10, 49, 10, 49, 57, 49, 10, 49, 10, 49, 57,
            50, 10, 49, 10, 49, 57, 51, 10, 49, 10, 49, 57, 52, 10, 49, 10, 49, 57, 53,
            10, 49, 10, 49, 57, 54, 10, 49, 10, 49, 57, 55, 10, 49, 10, 49, 57, 56, 10,
            49, 10, 49, 57, 57, 10, 49, 10, 50, 48, 48, 10, 49, 10, 50, 48, 49, 10, 49,
            10, 50, 48, 50, 10, 49, 10, 50, 48, 51, 10, 49, 10, 50, 48, 52, 10, 50 };
    
//    for(int i : idades) {
//      System.out.print(i + " ");
//    }

    short option = 0;
    int index = 0;
    do {
      System.out.println(menu);
      option = scan.nextShort();
      if (option == 1) {
        System.out.println("Entre com a sua idade:");
        // int age = scan.nextInt();
        for(int i = 0; i < 200; i+=1) {
          int age = idades[i];
          checkAge(age);
          ages.add(age);
        }
        
//        System.out.println(ages);

      } else if (option == 2) {
        showReport(ages);
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    } while (option != 2);

  }

  static void showReport(ArrayList<Integer> ages) {
    int sizeAges = ages.size();
    int under18 = ages.stream().filter((age) -> age < 18).collect(Collectors.toList()).size();
    int adults =
        ages.stream().filter((age) -> age >= 18 && age <= 50).collect(Collectors.toList()).size();
    int over50 = sizeAges - (under18 + adults);

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

  static void checkAge(int age) {
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
