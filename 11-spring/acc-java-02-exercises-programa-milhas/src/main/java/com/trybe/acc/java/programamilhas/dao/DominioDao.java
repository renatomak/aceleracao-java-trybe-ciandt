package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import com.trybe.acc.java.programamilhas.util.TokenUtil;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;



@ApplicationScoped
public class DominioDao {

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
  public List<TipoLancamento> listAllTiposLancamentos() {
    String hql = "from " + TipoLancamento.class.getSimpleName();
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }


  /**
   * Método responsável pela realização do login.
   *
   * <p>
   * Não delete este método!
   * </p>
   */
  public List<Produto> listAllProdutos() {
    String hql = "from " + Produto.class.getSimpleName();
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }


  /**
   * Método responsável pela realização do login.
   *
   * <p>
   * Não delete este método!
   * </p>
   */
  public List<Parceiro> listAllParceiros() {
    String hql = "from " + Parceiro.class.getSimpleName();
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }

}
