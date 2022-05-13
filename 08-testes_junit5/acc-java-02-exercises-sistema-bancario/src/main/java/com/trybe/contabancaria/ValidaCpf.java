package com.trybe.contabancaria;

/**
 * Classe ValidaCpf.
 **/

public class ValidaCpf {

  /**
   * Método para validar um cpf.
   * @param cpf string.
   * @return boolean.
   */
  public static boolean validarCpf(String cpf) {
    boolean isValid = true;
    
    cpf = cpf.replace(".", "").replaceAll("-", "");


    String[] numbers = cpf.split("");
    int sum = 0;
    int count = 10;

    for (int index = 0; index < numbers.length - 2; index++) {
      sum += Integer.parseInt(numbers[index]) * count;
      --count;
    }
    int firstDV = 11 - (sum % 11);
    if (firstDV == 10 || firstDV == 11) {
      firstDV = 0;
    }

    count = 11;
    sum = 0;
    for (int index = 0; index < numbers.length - 1; index++) {
      sum += Integer.parseInt(numbers[index]) * count;
      --count;
    }

    int secondDV = 11 - (sum % 11);
    if (secondDV == 10 || secondDV == 11) {
      firstDV = 0;
    }
    

    if (firstDV != Integer.parseInt(numbers[9]) || secondDV != Integer.parseInt(numbers[10])) {
      isValid = false;
    }
    return isValid;
  }
}
