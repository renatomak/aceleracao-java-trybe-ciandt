package com.trybe.acc.java.caixaeletronico;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@DisplayName("Teste da classe Conta")
class ContaTest {

  private Conta conta;
  private Banco banco;
  private PessoaCliente pessoaCliente;
  String formatDate;

  @BeforeEach
  public void setUp() {
    pessoaCliente = new PessoaCliente("Renato Marques", "844.430.530-85", "123456789");
    banco = new Banco();
    conta = new Conta(ContaUtils.CONTA_CORRENTE, pessoaCliente, banco);

    String patternDate = "dd/MM/yyyy HH:mm:ss";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(patternDate);
    LocalDateTime instant = LocalDateTime.now();
    formatDate = dateTimeFormatter.format(instant);

  }
  @Test
  @DisplayName("6 - Testa o construtor da classe conta.")
  void construtorTest() {
    Assertions.assertNotNull(conta.getIdConta());
    Assertions.assertEquals(ContaUtils.CONTA_CORRENTE, conta.getTipoConta());
    Assertions.assertNotNull(conta.getPessoaCliente());
  }

  @Test
  @DisplayName("7 - Testa o método adicionar transação e retornar saldo da conta.")
  void adicionarTransacaoTestRetornarSaldoTest() {
    conta.adicionarTransacao(1000, "Deposito");
    conta.adicionarTransacao(2000, "Deposito");
    conta.adicionarTransacao(500, "Saque");

    Assertions.assertTrue(conta.getTransacaos().size() == 3);
    Assertions.assertEquals(2500.00, conta.retornarSaldo());

  }

  @Test
  @DisplayName("8 - Testa o método retornar resumo está retornando uma string com os valores corretamente.")
  void retornarResumoContaTest() {
    Assertions.assertTrue(conta.retornarResumoConta().contains("0.00 - Conta Corrente"));
  }

  @Test
  @DisplayName("9 - Testa o método retornar extrato está imprimindo os valores corretamente.")
  void retornarExtratoTest() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    conta.adicionarTransacao(1000, "Deposito");
    conta.adicionarTransacao(2000, "Deposito");
    conta.adicionarTransacao(500, "Saque");
    conta.retornarExtrato();

    String expected = String.format("%s - 1000.00 - Deposito\n%s - 2000.00 - Deposito\n%s - 500.00 - Saque", formatDate, formatDate, formatDate);

    String[] linha = baos.toString().split(System.lineSeparator());

    StringBuilder saida = new StringBuilder();

    for (String transacao : linha) {
      if (saida.length() == 0) {
        saida.append(transacao);
      } else {
        saida.append("\n").append(transacao);
      }
    }
    Assertions.assertEquals(expected, saida.toString());

  }

  @Test
  @DisplayName("10 - Testa o método Getter do atributo idConta está retornando.")
  void getIdContaTest() {
    Assertions.assertNotNull(conta.getIdConta());
  }

  @Test
  @DisplayName("11 - Testa o método método Getter do atributo pessoaCliente está retornando.")
  void getPessoaClienteTest() {
    Assertions.assertNotNull(conta.getPessoaCliente());
  }

}
