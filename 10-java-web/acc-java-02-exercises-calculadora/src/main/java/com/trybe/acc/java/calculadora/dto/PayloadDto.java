package com.trybe.acc.java.calculadora.dto;

public class PayloadDto {

  private Integer valor;

  public PayloadDto() {}

  public PayloadDto(Integer valor) {
    this.valor = valor;
  }

  public Integer getValor() {
    return valor;
  }
}
