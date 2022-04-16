package com.trybe.acc.java;

public class NullGuard {
  /**
   * printName recebe um int e return uma string.
   * 
   * @param divisor
   * @return
   */
  public String printName(int divisor) {
    // seu código será inserido aqui
    try {
      NullGenerator nullGenerator = new NullGenerator();
      return nullGenerator.getNome(divisor);
    } catch (Exception e) {
      // TODO: handle exception
      return "Nome nulo";
    }

  }
}
