package com.trybe.acc.java.calculadora.model;

public class Calculadora {

  private Integer primeiroValor;

  private Integer segundoValor;

  private String operacao;

  public Integer getPrimeiroValor() {
    return primeiroValor;
  }

  public void setPrimeiroValor(Integer primeiroValor) {
    this.primeiroValor = primeiroValor;
  }

  public Integer getSegundoValor() {
    return segundoValor;
  }

  public void setSegundoValor(Integer segundoValor) {
    this.segundoValor = segundoValor;
  }

  public String getOperacao() {
    return operacao;
  }

  public void setOperacao(String operacao) {
    this.operacao = operacao;
  }
}
