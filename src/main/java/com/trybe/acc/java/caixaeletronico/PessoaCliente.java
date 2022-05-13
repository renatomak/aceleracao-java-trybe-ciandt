package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class PessoaCliente {

  private String nomeCompleto;
  private String cpf;
  private String senha;
  private List<Conta> contas = new ArrayList<>();

  /**
   * Method constructor.
   * 
   * @param nomeCompleto type String.
   * @param cpf type String.
   * @param senha type String.
   */
  public PessoaCliente(String nomeCompleto, String cpf, String senha) {
    this.nomeCompleto = nomeCompleto;
    this.cpf = cpf;
    this.senha = senha;
    System.out
        .println(String.format("Nova pessoa cliente %s com CPF: %s criada!", nomeCompleto, cpf));
  }

  public void adicionarConta(Conta accont) {
    contas.add(accont);
  }

  public int retornaNumeroDeContas() {
    return contas.size();
  }

  public double retornarSaldoContaEspecifica(int index) {
    Conta conta = contas.get(index);
    return conta.retornarSaldo();
  }

  public String retornarIdContaEspecifica(int index) {
    Conta conta = contas.get(index);
    return conta.getIdConta();
  }

  public void retornarExtratoContaEspecifica(int index) {
    Conta conta = contas.get(index);
    conta.retornarExtrato();
  }

  public void adicionarTransacaoContaEspecifica(int index, double quantia, String descricao) {
    Conta conta = contas.get(index);
    conta.adicionarTransacao(quantia, descricao);
  }

  public boolean validarSenha(String senha) {
    return this.senha.equals(senha);
  }

  public void retornarResumoContas() {
    contas.forEach(conta -> System.out.println(conta.retornarResumoConta()));
  }

  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public List<Conta> getContas() {
    return contas;
  }

  public void setContas(List<Conta> contas) {
    this.contas = contas;
  }
}
