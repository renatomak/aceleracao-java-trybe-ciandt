package com.trybe.simuladordepix;

import com.trybe.simuladordepix.exception.ErroChaveEmBranco;
import com.trybe.simuladordepix.exception.ErroChaveNaoEncontrada;
import com.trybe.simuladordepix.exception.ErroInterno;
import com.trybe.simuladordepix.exception.ErroSaldoInsuficiente;
import com.trybe.simuladordepix.exception.ErroValorNaoPositivo;
import java.io.IOException;

public class ProcessadorDePix {

  private final Servidor servidor;

  public ProcessadorDePix(Servidor servidor) {
    this.servidor = servidor;
  }

  /**
   * Executa a operação do pix. Aqui é implementada a lógica de negócio sem envolver as interações
   * do aplicativo com a pessoa usuária.
   *
   * @param valor Valor em centavos a ser transferido.
   * @param chave Chave Pix do beneficiário da transação.
   *
   * @throws ErroDePix Erro de aplicação, caso ocorra qualquer inconformidade.
   * @throws IOException Caso aconteça algum problema relacionado à comunicação entre o aplicativo e
   *         o servidor na nuvem.
   */
  public void executarPix(int valor, String chave) throws ErroDePix, IOException {
    // TODO: Implementar.

    if (valor <= 0) {
      throw new ErroValorNaoPositivo();
    }

    if (chave.trim().isEmpty()) {
      throw new ErroChaveEmBranco();
    }
    Conexao conexao = null;

    try {
      conexao = servidor.abrirConexao();
      String result = conexao.enviarPix(valor, chave);

      if (!result.equals(CodigosDeRetorno.SUCESSO)) {
        if (result.equals(CodigosDeRetorno.SALDO_INSUFICIENTE)) {
          throw new ErroSaldoInsuficiente();
        } else if (result.equals(CodigosDeRetorno.CHAVE_PIX_NAO_ENCONTRADA)) {
          throw new ErroChaveNaoEncontrada();
        } else {
          throw new ErroInterno();
        }
      }
    } finally {
      conexao.close();
    }
  }
}
