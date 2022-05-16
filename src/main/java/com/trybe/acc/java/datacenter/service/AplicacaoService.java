package com.trybe.acc.java.datacenter.service;

import com.trybe.acc.java.datacenter.dao.AplicacaoDao;
import com.trybe.acc.java.datacenter.entity.Aplicacao;
import com.trybe.acc.java.datacenter.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

public class AplicacaoService implements ServiceInterface<Aplicacao, Long> {

  @Override
  public void save(Aplicacao aplicacao) {
    EntityManager em = JpaUtil.getEntityManager();
    AplicacaoDao servidorDao = new AplicacaoDao(em);

    em.getTransaction().begin();

    servidorDao.cadastrar(aplicacao);

    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void update(Aplicacao aplicacao) {
    EntityManager em = JpaUtil.getEntityManager();
    AplicacaoDao aplicacaoDao = new AplicacaoDao(em);

    em.getTransaction().begin();

    aplicacaoDao.atualizar(aplicacao);

    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = JpaUtil.getEntityManager();
    AplicacaoDao aplicacaoDao = new AplicacaoDao(em);

    em.getTransaction().begin();

    Aplicacao servidor = aplicacaoDao.buscarPorId(1L);

    aplicacaoDao.remover(servidor);

    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Aplicacao> list() {
//    EntityManager em = JpaUtil.getEntityManager();
//    AplicacaoDao aplicacaoDao = new AplicacaoDao(em);
//
//    List<Aplicacao> aplicacoes = aplicacaoDao.buscarTodos();
//
//    em.close();
//    return aplicacoes;
    EntityManager em = JpaUtil.getEntityManager();
    Query query = em.createQuery("from Aplicacao");
    return query.getResultList();
  }

  @Override
  public Aplicacao findById(Long id) {
    EntityManager em = JpaUtil.getEntityManager();
    AplicacaoDao aplicacaoDao = new AplicacaoDao(em);

    Aplicacao aplicacao = aplicacaoDao.buscarPorId(1L);

    em.close();

    return aplicacao;
  }
}
