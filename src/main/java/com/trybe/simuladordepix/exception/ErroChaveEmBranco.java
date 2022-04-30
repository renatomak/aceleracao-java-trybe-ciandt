package com.trybe.simuladordepix.exception;

import com.trybe.simuladordepix.ErroDePix;
import com.trybe.simuladordepix.Mensagens;

public class ErroChaveEmBranco extends ErroDePix {
  
  public ErroChaveEmBranco() {
    super(Mensagens.CHAVE_EM_BRANCO);
  }
}
