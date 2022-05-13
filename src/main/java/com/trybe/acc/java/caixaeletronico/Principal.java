package com.trybe.acc.java.caixaeletronico;

public class Principal {
  /**
   * Main method.
   * @param args not use args.
   */
  public static void main(String[] args) {
    Transacao transacao = new Transacao(500.00, "Testes");
    // System.out.println(transacao.retornarResumoTransacao());

    PessoaCliente pessoaCliente =
        new PessoaCliente("Renato Marques", "844.430.530-85", "123456789");
    Banco banco = new Banco();
    Conta conta = new Conta(ContaUtils.CONTA_CORRENTE, pessoaCliente, banco);
    pessoaCliente.adicionarConta(conta);
    conta.adicionarTransacao(1000, "Deposito");
    conta.adicionarTransacao(2000, "Deposito");
    conta.adicionarTransacao(500, "Saque");

    pessoaCliente.retornarResumoContas();
    System.out.println(pessoaCliente.retornarSaldoContaEspecifica(0));
  }
}
