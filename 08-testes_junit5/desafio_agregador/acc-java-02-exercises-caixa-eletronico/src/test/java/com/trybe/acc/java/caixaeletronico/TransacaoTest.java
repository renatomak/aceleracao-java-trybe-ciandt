package com.trybe.acc.java.caixaeletronico;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@DisplayName("Testes dos métodos da classe Transacao")
class TransacaoTest {

  Transacao transacao;
  String formatDate;
  @BeforeEach
  public void setUp() {
    transacao = new Transacao(1000.00, "Deposito recebido");
    String patternDate = "dd/MM/yyyy HH:mm:ss";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(patternDate);
    LocalDateTime instant = LocalDateTime.now();
    formatDate = dateTimeFormatter.format(instant);
  }

  @Test
  @DisplayName("21 - Testa o método construtor da classe Transacao.")
  void construtorTest() {
    Assertions.assertEquals(1000.00, transacao.getQuantia());
    Assertions.assertTrue(transacao.retornarResumoTransacao().contains("Deposito recebido"));
  }


  @Test
  @DisplayName("22 - Testa o método Getter do atributo quantia.")
  void getQuantiaTest() {
    Assertions.assertEquals(1000.00, transacao.getQuantia());
  }

  @Test
  @DisplayName("23 - Testa o método retornar resumo transacao.")
  void retornarResumoTransacaoTest() {
    String expected = String.format("%s - 1000.00 - Deposito recebido", formatDate);
    Assertions.assertEquals(expected, transacao.retornarResumoTransacao());
  }

  @Test
  @DisplayName("24 - Testa o método instante está gerando o instante corretamente.")
  void retornarInstanteTest() {
    Assertions.assertEquals(formatDate, transacao.retornarInstante());
  }
}
