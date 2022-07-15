package com.trybe.acc.java;

import java.util.Scanner;

public class AntecessorSucessor {

  /**
   * The main method.
   * https://github.com/tryber/acc-java-02-exercises-antecessor-sucessor
   * 
   * @param args the arguments
   */
  public static void main(String[] args) {

    // Ler a entrant de um numerous pelo console
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um número:");
    int numero = scan.nextInt();

    int antecessor = numero - 1;
    int sucessor = numero + 1;

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println("O número " + numero + " tem "
        + antecessor + " como seu antecessor e "
        + sucessor + " como seu sucessor.");

  }

}
