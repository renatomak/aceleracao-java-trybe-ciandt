package com.trybe.simuladordepix;

import java.io.IOException;

public class ControladorDePix {

  private final ProcessadorDePix processadorDePix;

  public ControladorDePix(ProcessadorDePix processadorDePix) {
    this.processadorDePix = processadorDePix;
  }

  /**
   * Método a ser executado no momento em que a pessoa usuária confirmar a operação de Pix.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @return Mensagem a ser exibida à pessoa usuária, informando-a sobre o resultado da operação.
   */
  public String aoConfirmarPix(int valor, String chave) {
    if (valor <= 0) {
      return Mensagens.VALOR_NAO_POSITIVO;
    }

    if (chave.trim().isEmpty()) {
      return Mensagens.CHAVE_EM_BRANCO;
    }
    try {
      processadorDePix.executarPix(valor, chave);
      return Mensagens.SUCESSO;
    } catch (ErroDePix e) {
      return e.getMessage();
    } catch (IOException e) {
      return Mensagens.ERRO_DE_CONEXAO;
    }
  }
}
