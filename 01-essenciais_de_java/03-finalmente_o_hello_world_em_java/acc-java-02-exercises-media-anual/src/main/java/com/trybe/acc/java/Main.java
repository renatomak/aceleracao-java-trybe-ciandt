package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Qual é o seu nome? ");
    String name = scan.next();

    Nota nota = new Nota();

    double[] assessments = new double[4];

    for (int index = 1; index <= assessments.length; index++) {

      System.out.println("Avaliação nº " + index + ": ");
      assessments[index - 1] = scan.nextDouble();
    }

    double avg = nota.calcularMedia(assessments[0], assessments[1], assessments[2], assessments[3]);

    System.out.println("Olá, " + name + ", sua média é " + avg);

  }

}
