package com.trybe.acc.java;

public class Fatorial {
  /**
  * The main method.
  *
  * @param args the arguments
  */
  public static void main(String[] args) {
    int index = 2;
    long fatorial18 = 1;
    int fat = 18;
    while (index <= fat) {
      fatorial18 *= index;
      index += 1;
    }
    
    System.out.println("O fatorial de 18 é igual a " + fatorial18);

  }
}
