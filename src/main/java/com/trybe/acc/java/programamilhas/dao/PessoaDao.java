package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.util.HashUtil;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

@ApplicationScoped
public class PessoaDao {

  @Inject
  EntityManager entityManager;

  @Inject
  private HashUtil hashUtil;

  /**
   * Método responsável pela realização do login.
   * 
   * <p>
   * Não delete este método!
   * </p>
   */
  public Pessoa autenticar(String login, String hash) {
    String hql = "from " + Pessoa.class.getSimpleName() + " where login = :login and hash = :hash";
    Query query = entityManager.createQuery(hql);
    query.setParameter("login", login);
    query.setParameter("hash", hash);
    return (Pessoa) query.getSingleResult();
  }

  /**
   * Method list all saldos.
   * 
   * @return list type List.
   */
  public List listAll() {
    String hql = "from " + Pessoa.class.getSimpleName();
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }
  
  

  /**
   * Method salve new pessoa.
   * 
   * @param entity type Pessoa.
   */
  @Transactional
  public void salve(Pessoa entity) {
    EntityManager em = entityManager.getEntityManagerFactory().createEntityManager();
    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();
    em.close();
  }


  public PessoaDao() {}
}
