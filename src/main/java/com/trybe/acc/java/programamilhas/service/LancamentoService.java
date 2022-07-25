package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.LancamentoDao;
import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.util.TokenUtil;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;



@ApplicationScoped
public class LancamentoService {

  @Inject
  private TokenUtil tokenUtil;

  @Inject
  LancamentoDao lancamentoDao;


  /**
   * Method get saldo.
   * 
   * @param token type String.
   * @return saldo type SaldoResult.
   * @throws AcessoNaoAutorizadoException type exception.
   */
  @Transactional
  public SaldoResult getSaldo(String token) throws AcessoNaoAutorizadoException {
    Integer id = tokenUtil.obterIdUsuario(token);
    return lancamentoDao.getSaldoById(id);
  }

  public List<SaldoResult> listSaldos(String token) throws AcessoNaoAutorizadoException {
    tokenUtil.validarAdmToken(token);
    return lancamentoDao.getAllSaldos(token);
  }
}
