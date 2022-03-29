package com.trybe.acc.java;

public class Fatorial {
  /**
  * The main method.
  *
  * @param args the arguments
  */
  public static void main(String[] args) {
    
    long fatorial18 = fatorial();
    System.out.println("O fatorial de 18 é igual a " + fatorial18);

  }
  
  public static long fatorial() {
    int index = 2;
    long result = 1;
    int fat = 18;
    while(index <= fat) {
	result *= index;
	index += 1;
    }
    return result;
  }

}
