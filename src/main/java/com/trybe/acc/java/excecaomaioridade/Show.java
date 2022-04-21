package com.trybe.acc.java.excecaomaioridade;

/**
 * Classe do desafio.
 */
public class Show {

  /**
   * Método do desafio.
   * 
   * @param idade valor inteiro
   * @return true or false
   * @throws PessoaMenorDeIdadeException quando a idade for menor que 18
   */
  public boolean permitirEntrada(int idade) throws PessoaMenorDeIdadeException {

    if (idade < 18) {
      throw new PessoaMenorDeIdadeException();
    }
    return true;
  }
}
