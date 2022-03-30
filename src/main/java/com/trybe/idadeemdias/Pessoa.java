package com.trybe.idadeemdias;

public class Pessoa {

  private String nome;

  public int calcularIdadeEmDias(int anos, int meses, int dias) {
    return (anos * 365) + (meses * 30) + dias;
  }

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public Pessoa() {

  }

  public String getNome() {
    return this.nome;
  }

}
