package com.trybe.acc.java.caixaeletronico;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@DisplayName("Teste dos métodos da classe PessoaCliente")
class PessoaClienteTest {

  PessoaCliente pessoaCliente;
  Conta conta;
  Banco banco;
  String formatDate;

  @BeforeEach
  public void setUp() {
    pessoaCliente = new PessoaCliente("Renato Marques", "844.430.530-85", "123456789");
    banco = new Banco();
    conta = new Conta(ContaUtils.CONTA_CORRENTE, pessoaCliente, banco);
    pessoaCliente.adicionarConta(conta);
    conta.adicionarTransacao(100, ContaUtils.TRANSACAO_SAQUE);

    String patternDate = "dd/MM/yyyy HH:mm:ss";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(patternDate);
    LocalDateTime instant = LocalDateTime.now();
    formatDate = dateTimeFormatter.format(instant);
  }

  @AfterEach
  public void cleanUpEach() {
    Banco.setNumberOfAccounts(0);
  }

  @Test
  @DisplayName("12 - Testa o construtor da classe Pessoa Cliente.")
  void construtorTest() {
    String expected = "Nova pessoa cliente Renato Marques com CPF: 844.430.530-85 criada!";
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    PessoaCliente cliente = new PessoaCliente("Renato Marques", "844.430.530-85", "123456789");

    String[] linha = baos.toString().split(System.lineSeparator());
    String saida = linha[linha.length - 1];

    Assertions.assertNotNull(cliente);
    Assertions.assertEquals(expected, saida);
  }

  @Test
  @DisplayName("13 - Testa o método adicionar conta e o método retornar número de contas.")
  void adicionarContaTestRetornaNumeroDeContasTest() {
    Assertions.assertNotNull(pessoaCliente.getContas().get(0));
    Assertions.assertTrue(pessoaCliente.retornaNumeroDeContas() == 1);
  }

  @Test
  @DisplayName("14 - Testa o método retornar saldo de uma conta específica da pessoa cliente.")
  void retornarSaldoContaEspecificaTest() {
    Assertions.assertEquals(700.00, pessoaCliente.retornarSaldoContaEspecifica(0));
  }


  @Test
  @DisplayName("15 - Testa o método retornar id de uma conta específica da pessoa cliente.")
  void retornarIdContaEspecificaTest() {
    Assertions.assertNotNull(pessoaCliente.retornarIdContaEspecifica(0));
  }

  @Test
  @DisplayName("16 - Testa o método retornar o extrato de uma conta específica da pessoa cliente.")
  void retornarExtratoContaEspecificaTest() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    pessoaCliente.retornarExtratoContaEspecifica(0);

    String expected =
        String.format("%s - 100.00 - Saque",
            formatDate);

    String[] line = baos.toString().split(System.lineSeparator());

    StringBuilder exit = new StringBuilder();

    for (String transacao : line) {
      if (exit.length() == 0) {
        exit.append(transacao);
      } else {
        exit.append("\n").append(transacao);
      }
    }
    Assertions.assertEquals(expected, exit.toString());
  }

  @Test
  @DisplayName("17 - Testa o método adiciona transacao de uma conta específica da pessoa cliente.")
  void adicionarTransacaoContaEspecificaTest() {
    pessoaCliente.adicionarTransacaoContaEspecifica(0, 1000.00, ContaUtils.TRANSACAO_DEPOSITO);
    Assertions.assertEquals(2, conta.getTransacoes().size());
  }

  @Test
  @DisplayName("18 - Testa o método validar senha.")
  void validarSenhaTest() {
    Assertions.assertTrue(pessoaCliente.validarSenha("123456789"));
    Assertions.assertFalse(pessoaCliente.validarSenha("123"));
  }

  @Test
  @DisplayName("19 - Testa o método retornar resumo contas.")
  void retornarResumoContasTest() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(baos);
    System.setOut(printStream);

    pessoaCliente.retornarResumoContas();

    String[] line = baos.toString().split(System.lineSeparator());

    StringBuilder exit = new StringBuilder();

    for (String transacao : line) {
      if (exit.length() == 0) {
        exit.append(transacao);
      } else {
        exit.append("\n").append(transacao);
      }
    }
    System.out.println(exit.toString());
    Assertions.assertTrue(exit.toString().contains(" - 700.00 - Conta Corrente"));
  }

  @Test
  @DisplayName("20 - Testa o método Getter do atributo cpf está retornando.")
  void getCpfTest() {
    Assertions.assertEquals("844.430.530-85", pessoaCliente.getCpf());
  }

}
