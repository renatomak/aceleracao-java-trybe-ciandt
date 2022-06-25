package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.model.Lancamento;
import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.util.TokenUtil;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;


@ApplicationScoped
public class LancamentoDao {

  @Inject
  EntityManager entityManager;

  @Inject
  private PessoaDao pessoaDao;

  @Inject
  private TokenUtil tokenUtil;

  /**
   * Método responsável pela realização do login.
   *
   * <p>
   * Não delete este método!
   * </p>
   */
  public SaldoResult getSaldoById(Integer id) {
    String hql =
        "select sum(valor) from " + Lancamento.class.getSimpleName() + " where idpessoa=:id";
    Query query = entityManager.createQuery(hql);
    query.setParameter("id", id);
    Integer saldo = query.getFirstResult();
    SaldoResult saldoResult = new SaldoResult();
    saldoResult.setSaldo(saldo);
    return saldoResult;
  }


  /**
   * Method list all saldo result.
   * 
   * @return list type SaldoResult.
   */
  public List<SaldoResult> getAllSaldos(String token) {
    List<Pessoa> pessoas = pessoaDao.listAll();

    List<SaldoResult> saldoResults = new ArrayList<>();

    pessoas.forEach(pessoa -> {
      try {
        Integer id = tokenUtil.obterIdUsuario(token);
        SaldoResult saldoResult = getSaldoById(id);
        saldoResults.add(saldoResult);
      } catch (AcessoNaoAutorizadoException e) {
        throw new RuntimeException(e);
      }
    });

    return saldoResults;
  }

}
