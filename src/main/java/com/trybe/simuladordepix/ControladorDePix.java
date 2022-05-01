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
      // TODO Auto-generated catch block
      if (e.getMessage().contains(Mensagens.CHAVE_NAO_ENCONTRADA)) {
        return Mensagens.CHAVE_NAO_ENCONTRADA;
      }
      if (e.getMessage().contains(Mensagens.SALDO_INSUFICIENTE)) {
        return Mensagens.SALDO_INSUFICIENTE;
      }
      if (e.getMessage().contains(Mensagens.ERRO_INTERNO)) {
        return Mensagens.ERRO_INTERNO;
      }
      if (e.getMessage().contains(Mensagens.ERRO_DE_CONEXAO)) {
        return Mensagens.ERRO_DE_CONEXAO;
      }
      // e.printStackTrace();
    } catch (IOException e) {
      // TODO: handle exception
      return Mensagens.ERRO_DE_CONEXAO;
    }
    return null; // TODO: Implementar.
  }
}
