package com.trybe.acc.java;

import java.time.LocalDateTime;

public class SimuladorRendimento {
  /**
   * Função utilizada apenas para validação da solução do desafio.
   *
   * @param args Não utilizado.
   */
  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double inicial = 500;
    double objetivo = 5000;
    System.out.println("Com " + inicial + " seu rendimento será " + objetivo + " no ano "
        + obj.simularRendimentoAnos(inicial, objetivo));
  }

  /**
   * Função para calcular o tempo necessario para que o dinheiro inicial atinga o objetivo.
   * @param initial double.
   * @param objective double.
   * @return number integer. 
   */
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
