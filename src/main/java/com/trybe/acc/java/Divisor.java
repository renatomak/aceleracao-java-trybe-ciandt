package com.trybe.acc.java;

public class Divisor {

  /**
   * dividir dois int.
   * @param a int
   * @param b int
   * @return int
   */
  public Integer dividir(int a, int b) {
    int result = 0;
    try {
      result = a / b;
    } catch (ArithmeticException e) {
      // TODO: handle exception
      System.out.println("Não é possível fazer divisão por zero.");
    }
    return result;
  }

}
