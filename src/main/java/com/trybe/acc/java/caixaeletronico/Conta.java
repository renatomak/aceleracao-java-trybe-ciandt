package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class Conta {

  private String tipoConta;
  private String idConta;
  private PessoaCliente pessoaCliente;
  private List<Transacao> transacoes = new ArrayList<>();
  private double saldo;

  /**
   * Método construtor.
   * 
   * @param tipoConta string.
   * @param pessoaCliente do tipo PessoaCliente.
   * @param banco do tipo Banco.
   */
  public Conta(String tipoConta, PessoaCliente pessoaCliente, Banco banco) {
    this.tipoConta = tipoConta;
    this.idConta = banco.gerarNumeroNovaConta();
    this.pessoaCliente = pessoaCliente;
    this.saldo = 0.0;
    if (tipoConta.equals(ContaUtils.CONTA_CORRENTE)) {
      this.saldo = 800.00;
    }
  }

  /**
   * Method add transaction.
   *
   * @param quantidade type double.
   * @param descricao type String.
   */
  public void adicionarTransacao(double quantidade, String descricao) {
    Transacao transacao = new Transacao(quantidade, descricao);

    if (descricao.equals(ContaUtils.TRANSACAO_DEPOSITO)) {
      this.saldo += quantidade;
      transacoes.add(transacao);
    }
    if (descricao.equals(ContaUtils.TRANSACAO_SAQUE)) {
      if (this.saldo >= quantidade) {
        this.saldo -= quantidade;
        transacoes.add(transacao);
      }
    }
  }

  /**
   * Método para retornar o salda da conta.
   * 
   * @return double
   */
  public double retornarSaldo() {
    return this.saldo;
  }

  public String retornarResumoConta() {
    double saldo = retornarSaldo();
    return String.format("%s - %.2f - %s", idConta, saldo, tipoConta);
  }

  public void retornarExtrato() {
    transacoes.forEach(transacao -> System.out.println(transacao.retornarResumoTransacao()));
  }

  public String getIdConta() {
    return idConta;
  }

  public PessoaCliente getPessoaCliente() {
    return pessoaCliente;
  }

  public String getTipoConta() {
    return tipoConta;
  }

  public List<Transacao> getTransacoes() {
    return transacoes;
  }
}
