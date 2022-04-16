package com.trybe.acc.java;

public class NullGenerator {

  /**
   * getName return String.
   * 
   * @param number integer
   * @return string
   * @throws NullPointerException quando o valor for impar.
   */
  public String getNome(Integer number) throws NullPointerException {
    if (number % 2 != 0) {
      throw new NullPointerException();
    }
    return "BOB";
  }

}
