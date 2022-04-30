package com.trybe.simuladordepix.exception;

import com.trybe.simuladordepix.ErroDePix;
import com.trybe.simuladordepix.Mensagens;

public class ErroChaveNaoEncontrada extends ErroDePix {

  public ErroChaveNaoEncontrada() {
    super(Mensagens.CHAVE_NAO_ENCONTRADA);
  }

}
