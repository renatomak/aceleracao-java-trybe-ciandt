package com.trybe.acc.java.caixaeletronico;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class Banco {
  private static final int DEFAULT_SIZE_ACCOUNT_NUMBER = 10;
  private static int numberOfAccounts = 0;
  private List<PessoaCliente> clients = new ArrayList<>();
  private List<Conta> contas = new ArrayList<>();

  public String gerarNumeroNovaConta() {
    numberOfAccounts++;
    String numberAccount = "" + numberOfAccounts;
    if (numberAccount.length() == DEFAULT_SIZE_ACCOUNT_NUMBER) {
      return numberAccount;
    }
    return StringUtils.leftPad(numberAccount, DEFAULT_SIZE_ACCOUNT_NUMBER, '0');
  }

  public PessoaCliente adicionaPessoaCliente(String name, String tipyAccount, String cpf,
      String password) {
    PessoaCliente client = new PessoaCliente(name, cpf, password);
    Conta account = new Conta(tipyAccount, client, this);
    Conta poupanca = new Conta(AccountUtils.CONTA_POUPANCA, client, this);

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

  public PessoaCliente pessoaClienteLogin(String cpf, String password) {
    List<PessoaCliente> collect = clients.stream()
        .filter(client -> client.getCpf().equals(cpf) && client.getSenha().equals(password))
        .collect(Collectors.toList());
    return collect.get(0);
  }

  public void transferirFundos(PessoaCliente pessoaCliente, int daConta, int paraConta,
      double quantia) {
    this.sacar(pessoaCliente, daConta, quantia);
    pessoaCliente.adicionarTransacaoContaEspecifica(paraConta, quantia,
        AccountUtils.TRANSACAO_DEPOSITO);
  }

  public void sacar(PessoaCliente pessoaCliente, int daConta, double quantia) {
    pessoaCliente.adicionarTransacaoContaEspecifica(daConta, quantia, AccountUtils.TRANSACAO_SAQUE);
  }

}
