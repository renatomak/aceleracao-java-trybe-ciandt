package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class Conta {

  private String tipoConta;
  private String idConta;
  private PessoaCliente pessoaCliente;
  private List<Transacao> transacaos = new ArrayList<>();

  public Conta(String tipoConta, PessoaCliente pessoaCliente, Banco banco) {
    this.tipoConta = tipoConta;
    this.idConta = banco.gerarNumeroNovaConta();
    this.pessoaCliente = pessoaCliente;
  }

  public void adicionarTransacao(double quantidade, String descricao) {
    Transacao transacao = new Transacao(quantidade, descricao);
    transacaos.add(transacao);
  }

  public double retornarSaldo() {
    double depositos =
        transacaos.stream().filter(transacao -> transacao.getDescricao().contains("Deposito"))
            .mapToDouble(Transacao::getQuantia).sum();
    double saques =
        transacaos.stream().filter(transacao -> transacao.getDescricao().contains("Saque"))
            .mapToDouble(Transacao::getQuantia).sum();

    return depositos - saques;
  }

  public String retornarResumoConta() {
    double saldo = retornarSaldo();
    return String.format("%s - %.2f - %s", idConta, saldo, tipoConta);
  }

  public void retornarExtrato() {
    transacaos.forEach(transacao -> System.out.println(transacao.retornarResumoTransacao()));
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

  public List<Transacao> getTransacaos() {
    return transacaos;
  }
}
