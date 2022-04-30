package com.trybe.simuladordepix.exception;

import com.trybe.simuladordepix.ErroDePix;
import com.trybe.simuladordepix.Mensagens;

public class ErroInterno extends ErroDePix {

  public ErroInterno() {
    super(Mensagens.ERRO_INTERNO);
  }
}
