package com.trybe.acc.java.sistemadevotacao;

public abstract class Pessoa {

  protected String nome;

  /**
   * constructor.
   * @param nome string
   */
  public Pessoa(String nome) {
    // TODO Auto-generated constructor stub
    this.nome = nome;
  }

  abstract String getNome();

  abstract void setNome(String nome);
}
