package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Lancamento;
import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.util.TokenUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
    List<Lancamento> lancamentos = getAllLancamentos();

    Integer saldo = lancamentos.stream()
        .filter(lancamento -> Objects.equals(lancamento.getUsuario().getId(), id))
        .reduce(0, (acc, item) -> acc + item.getValor(), Integer::sum);

    SaldoResult saldoResult = new SaldoResult();
    saldoResult.setSaldo(saldo);

    return saldoResult;
  }

  /**
   * Method list all saldo result.
   * 
   * @return list type SaldoResult.
   */
  public List<Lancamento> getAllLancamentos() {
    String hql = "from " + Lancamento.class.getSimpleName();
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
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
      SaldoResult saldoResult = getSaldoById(pessoa.getId());
      System.out.println("\n" + saldoResult + "\n");
      saldoResults.add(saldoResult);
    });

    List<Lancamento> allLancamentos = getAllLancamentos();

    allLancamentos.forEach(x -> System.out.println(x.getValor()));

    return saldoResults;
  }

}
