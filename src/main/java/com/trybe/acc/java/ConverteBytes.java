package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class ConverteBytes {
  /**
  * The main method.
  *
  * @param args the arguments
  */
  public static void main(String[] args) {
    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite um número:");
    byte valor = scan.nextByte();
    
    // Seu código aqui
    
    // Imprime a saída no console. OBS: descomente a próxima linha
    //System.out.println(valor + " bytes correspodem a " + qtdBits + " bits");
  }

}
