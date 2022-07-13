package com.trybe.acc.java.minhasseries.dto;

public class TempoDto {

  private Integer tempoEmMinutos;

  public TempoDto() {}

  public TempoDto(Integer tempoEmMinutos) {
    this.tempoEmMinutos = tempoEmMinutos;
  }

  public Integer getTempoEmMinutos() {
    return tempoEmMinutos;
  }

  public void setTempoEmMinutos(Integer tempoEmMinutos) {
    this.tempoEmMinutos = tempoEmMinutos;
  }
}
