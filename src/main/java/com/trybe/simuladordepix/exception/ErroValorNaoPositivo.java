package com.trybe.simuladordepix.exception;

import com.trybe.simuladordepix.ErroDePix;
import com.trybe.simuladordepix.Mensagens;

public class ErroValorNaoPositivo extends ErroDePix {
  
  public ErroValorNaoPositivo() {
    super(Mensagens.VALOR_NAO_POSITIVO);
  }

}
