package com.trybe.acc.java.minhasseries.service.exceptions;

public class SerieExistenteException extends RuntimeException {
  private static final long serialVersionUID = 2062434147875331065L;

  public SerieExistenteException() {
    super("Série Existente");
  }
}
