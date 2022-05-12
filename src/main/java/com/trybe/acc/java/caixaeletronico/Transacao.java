package com.trybe.acc.java.caixaeletronico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
  private double quantia;
  private String instante;
  private String descricao;

  private Conta conta;

  public Transacao(double quantia, String descricao) {
    this.quantia = quantia;
    this.descricao = descricao;
    this.instante = retornarInstante();
  }

  public String retornarInstante() {
    String patternDate = "dd/MM/yyyy HH:mm:ss";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(patternDate);

    LocalDateTime instant = LocalDateTime.now();
    return dateTimeFormatter.format(instant);
  }

  public double getQuantia() {
    return quantia;
  }

  public String getDescricao() {
    return descricao;
  }

  public String retornarResumoTransacao() {
    return String.format("%s - %.2f - %s", instante, quantia, descricao);
  }
}

