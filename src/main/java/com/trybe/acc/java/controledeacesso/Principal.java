package com.trybe.acc.java.controledeacesso;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);
    String menu = String.format("Entre com o número correspondente à opção desejada:\n"
        + "1 - Acessar o estabelecimento\n" + "2 - Finalizar sistema e mostrar relatório");

    ArrayList<Short> ages = new ArrayList<Short>();
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
        System.out.println("Exibir relatrio");
        imprime(ages);
      } else {
        System.out.println("Entre com uma opção válida!");
      }
    } while (option != 2);


  }
  
  static void imprime(ArrayList<Short> ages) {
    for(short age : ages) {
      System.out.print(age);
    }
  }
  
  static void checkAge(Short age) {
    if(age < 18) {
      System.out.println("Pessoa cliente menor de idade, catraca liberada!");
    } else if (age >= 18 && age <= 50) {
      System.out.println("Pessoa adulta, catraca liberada!");
    } else if (age > 50) {
      System.out.println("Pessoa adulta maior de 50, catraca liberada!");
    } else {
      System.out.println("Entre com uma opção válida!");
    }
  }
}
