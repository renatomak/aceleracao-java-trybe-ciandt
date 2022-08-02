package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.DominioDao;
import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;


@ApplicationScoped
public class DominioService {

  @Inject
  private DominioDao dominioDao;


  /**
   * Method crate TipoLancamento.
   *
   * @return pessoaResponseDto type TipoLancamentoDto.
   */
  @Transactional
  public List<TipoLancamento> listTipoLancamentos() {
    return dominioDao.listAllTiposLancamentos();
  }

  @Transactional
  public List<Produto> listProdutos() {
    return dominioDao.listAllProdutos();
  }

  @Transactional
  public List<Parceiro> listParceiros() {
    return dominioDao.listAllParceiros();
  }

}
