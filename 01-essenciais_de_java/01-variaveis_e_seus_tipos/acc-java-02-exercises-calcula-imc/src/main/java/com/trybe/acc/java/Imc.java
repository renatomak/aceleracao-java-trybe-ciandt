package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class Imc {
  /**
  * The main method.
  *
  * @param args the arguments
  */
  public static void main(String[] args) {
    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o peso:");
    float peso = scan.nextFloat();

    System.out.println("Digite a aultura:");
    float altura = scan.nextFloat();

    // Seu código aqui
    float imc = peso / (altura * altura);

    // Imprime a saída no console. OBS: descomente a próxima linha
    System.out.println(imc);
  }
  
}