package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Banco {
  private static int numberOfAccounts = 0;
  private List<PessoaCliente> clients = new ArrayList<>();
  private List<Conta> contas = new ArrayList<>();

  /**
   * Method for generate new number account.
   * 
   * @return string with new number account.
   */
  public String gerarNumeroNovaConta() {
    numberOfAccounts++;
    String numberAccount = "";
    for (int i = 0; i < 10; i++) {
      if (numberAccount.length() + ("" + numberOfAccounts).length() < 10) {
        numberAccount += "0";
      }
    }
    numberAccount += "" + numberOfAccounts;
    return numberAccount;
  }


  /**
   * Method for add new person client.
   * 
   * @param name type string.
   * @param tipyAccount type string.
   * @param cpf type string.
   * @param password type string.
   * @return new person client.
   */
  public PessoaCliente adicionaPessoaCliente(String name, String tipyAccount, String cpf,
      String password) {
    PessoaCliente client = new PessoaCliente(name, cpf, password);
    Conta account = new Conta(tipyAccount, client, this);
    Conta poupanca = new Conta(ContaUtils.CONTA_POUPANCA, client, this);

    client.adicionarConta(account);
    client.adicionarConta(poupanca);
    clients.add(client);

    adicionarConta(account);
    adicionarConta(poupanca);

    return client;
  }

  public void adicionarConta(Conta account) {
    contas.add(account);
  }

  public int quantidadeClientes() {
    return clients.size();
  }

  /**
   * Method create new person client.
   * 
   * @param cpf type string.
   * @param password type string.
   * @return type person client.
   */
  public PessoaCliente pessoaClienteLogin(String cpf, String password) {
    List<PessoaCliente> collect = clients.stream()
        .filter(client -> client.getCpf().equals(cpf) && client.getSenha().equals(password))
        .collect(Collectors.toList());
    return collect.get(0);
  }

  /**
   * Method for transfer funds.
   * 
   * @param pessoaCliente type person client.
   * @param daConta type int.
   * @param paraConta type int.
   * @param quantia type double.
   */
  public void transferirFundos(PessoaCliente pessoaCliente, int daConta, int paraConta,
      double quantia) {
    this.sacar(pessoaCliente, daConta, quantia);
    pessoaCliente.adicionarTransacaoContaEspecifica(paraConta, quantia,
        ContaUtils.TRANSACAO_DEPOSITO);
  }

  public void sacar(PessoaCliente pessoaCliente, int daConta, double quantia) {
    pessoaCliente.adicionarTransacaoContaEspecifica(daConta, quantia, ContaUtils.TRANSACAO_SAQUE);
  }

  public static void setNumberOfAccounts(int numberOfAccounts) {
    Banco.numberOfAccounts = numberOfAccounts;
  }
}
