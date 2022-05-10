package com.trybe.contabancaria;

/**
 * Classe ContaBancaria.
 **/

public class ContaBancaria {

  private int saldo;
  private Cliente cliente;

  public ContaBancaria() {
    this.saldo = 0;
    cliente = new Cliente();
  }

  public int depositar(int saldo) {
    this.saldo += saldo;
    return this.saldo;
  }

  public int sacar(int saque) {
    return this.saldo -= saque;
  }

  public int verSaldo() {
    return this.saldo;
  }

  public void setNomeCliente(String nome) {
    this.cliente.setNome(nome);
  }

  public String getNomeCliente() {
    return this.cliente.getNome();
  }

  public void setCpfCliente(String cpfCliente) {
    this.cliente.setCpf(cpfCliente);
  }

  public String getCpfCliente() {
    return this.cliente.getCpf();
  }
}
