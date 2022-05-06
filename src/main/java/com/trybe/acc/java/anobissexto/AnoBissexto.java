package com.trybe.acc.java.anobissexto;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class AnoBissexto {

  public boolean identificarAnoBissexto(int ano) {
    return Year.isLeap(ano);
  }

  /**
   * @param data string
   * @return ano int
   */
  public int identificarProximoAnoBissexto(String data) {
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate date = LocalDate.parse(data, dateFormatter);

    do {
      date = LocalDate.parse(dateFormatter.format(date.plusYears(1)), dateFormatter);
    } while (!Year.isLeap(date.getYear()));

    return date.getYear();
  }
}
