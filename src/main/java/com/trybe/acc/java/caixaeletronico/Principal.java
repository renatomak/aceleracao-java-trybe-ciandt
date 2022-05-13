package com.trybe.acc.java.caixaeletronico;

public class Principal {
  /**
   * Main method.
   * 
   * @param args not use args.
   */
  public static void main(String[] args) {
    Banco banco = new Banco();
    banco.adicionarPessoaCliente("Renato Marques", ContaUtils.CONTA_CORRENTE, "844.430.530-85",
        "123456789");

    PessoaCliente pessoaCliente = banco.getPessoaCliente(0);
    System.out.println(pessoaCliente.getContas().size());

    System.out.println(pessoaCliente.retornarSaldoContaEspecifica(0));
  }
}
