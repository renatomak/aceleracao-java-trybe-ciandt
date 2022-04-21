package com.trybe.acc.java.excecaomaioridade;

import java.beans.ExceptionListener;

public class PessoaMenorDeIdadeException extends Exception {

  public PessoaMenorDeIdadeException() {
    super("Pessoa menor de 18 anos! Entrada não permitida");
  }


}
