package com.trybe.acc.java.excecaomaioridade;

/**
 * Classe do desafio.
 */
public class Show {

  /**
   * Método do desafio.
   * 
   * @param idade
   * @return
   * @throws PessoaMenorDeIdadeException
   */
  public boolean permitirEntrada(int idade) throws PessoaMenorDeIdadeException {

    if (idade < 18) {
      throw new PessoaMenorDeIdadeException();
    }
    return true;
  }
}
