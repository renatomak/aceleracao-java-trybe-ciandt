package com.trybe.acc.java;

import java.time.LocalDateTime;

public class SimuladorRendimento {

  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println("Com " + inicial + " seu rendimento será " + objetivo + " no ano "
        + obj.simularRendimentoAnos(inicial, objetivo));
  }

  public int simularRendimentoAnos(double initial, double objective) {
    double yieldRate = 0.10;
    double yield = initial;
    int countYear = 0;

    do {
      yield += yield * yieldRate;
      countYear++;

    } while (yield < objective);

    LocalDateTime resultYears = LocalDateTime.now().plusYears(countYear);


    return resultYears.getYear();
  }

}
