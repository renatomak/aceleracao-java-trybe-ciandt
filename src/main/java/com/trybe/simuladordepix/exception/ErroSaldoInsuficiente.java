package com.trybe.simuladordepix.exception;

import com.trybe.simuladordepix.ErroDePix;
import com.trybe.simuladordepix.Mensagens;

public class ErroSaldoInsuficiente extends ErroDePix {

  public ErroSaldoInsuficiente() {
    super(Mensagens.SALDO_INSUFICIENTE);
  }
}
