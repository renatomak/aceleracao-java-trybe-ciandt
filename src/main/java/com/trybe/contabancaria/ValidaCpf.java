package com.trybe.contabancaria;

/**
 * Classe ValidaCpf.
 **/

public class ValidaCpf {

  public static boolean validarCpf(String cpf) {
    boolean isValid = true;
    String strDV_01 = cpf.substring(cpf.length() - 2, cpf.length() - 1);
    String strDV_02 = cpf.substring(cpf.length() - 1);

    String numbers = cpf.substring(0, cpf.length() - 3).replace(".", "");

    String[] listFistPart = numbers.split("");
    int sum = 0;
    int count = 10;

    for (int index = 0; index < listFistPart.length; index++) {
      sum += Integer.parseInt(listFistPart[index]) * count;
      --count;
    }
    int firstDV = 11 - (sum % 11);
    if (firstDV == 10 || firstDV == 11) {
      firstDV = 0;
    }

    numbers = cpf.substring(0, cpf.length() - 1).replace(".", "").replace("-", "");

    listFistPart = numbers.split("");

    count = 11;
    sum = 0;
    for (int index = 0; index < listFistPart.length; index++) {
      sum += Integer.parseInt(listFistPart[index]) * count;
      --count;
    }

    int secondDV = 11 - (sum % 11);
    if (secondDV == 10 || secondDV == 11) {
      firstDV = 0;
    }

    if (firstDV != Integer.parseInt(strDV_01) || secondDV != Integer.parseInt(strDV_02)) {
      isValid = false;
    }
    return isValid;
  }
}
