package com.trybe.acc.java.iocdi.sistemapagamentos.model;

import java.util.Objects;

public class Payment {

  private String id;
  private String valor;

  public Payment(String id, String valor) {
    this.id = id;
    this.valor = valor;
  }

  public Payment() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Payment payment = (Payment) o;
    return id.equals(payment.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
