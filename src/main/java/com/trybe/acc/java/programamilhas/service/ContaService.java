package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.LancamentoDao;
import com.trybe.acc.java.programamilhas.dao.PessoaDao;
import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.util.TokenUtil;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;



@ApplicationScoped
public class ContaService {

  @Inject
  private PessoaDao pessoaDao;

  @Inject
  private LancamentoDao lancamentoDao;

  @Inject
  private TokenUtil tokenUtil;

  /**
   * Method crate Pessoa.
   * 
   * @param token type PessoaRequestDto.
   */
  @Transactional
  public List<SaldoResult> getAllSaldos(String token) throws AcessoNaoAutorizadoException {
    tokenUtil.validarAdmToken(token);
    return lancamentoDao.getAllSaldos(token);
  }

  /**
   * Method crate Pessoa.
   *
   * @param token type PessoaRequestDto.
   */
  @Transactional
  public SaldoResult getSaldo(String token) throws AcessoNaoAutorizadoException {
    Integer id = tokenUtil.obterIdUsuario(token);
    return lancamentoDao.getSaldoById(id);
  }
}
