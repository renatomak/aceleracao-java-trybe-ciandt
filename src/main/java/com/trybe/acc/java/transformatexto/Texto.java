package com.trybe.acc.java.transformatexto;

public class Texto {
  /**
   * @param string
   * @return string
   */
  public String transformaTexto(String string) {
    String newString = string.replace("+", " ");
    int indexA = string.indexOf("a");

    if (indexA % 2 == 0) {
      newString = newString.toUpperCase();
    } else {
      String[] array = newString.split(" ");
      newString = array[0];
    }
    return newString;
  }

}
