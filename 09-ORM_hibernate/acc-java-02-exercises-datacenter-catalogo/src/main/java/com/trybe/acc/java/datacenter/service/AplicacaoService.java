package com.trybe.acc.java.datacenter.service;

import com.trybe.acc.java.datacenter.entity.Aplicacao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public class AplicacaoService implements ServiceInterface<Aplicacao, Long> {

  @Override
  public void save(Aplicacao entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void update(Aplicacao entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = emf.createEntityManager();

    Aplicacao toBeDeleted = em.find(Aplicacao.class, id);
    if (toBeDeleted == null) {
      return;
    }

    em.getTransaction().begin();
    em.remove(toBeDeleted);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Aplicacao> list() {
    EntityManager em = emf.createEntityManager();

    return em.createQuery("SELECT a FROM Aplicacao a", Aplicacao.class)
            .getResultList();
  }

  @Override
  public Aplicacao findById(Long id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Aplicacao.class, id);
  }
}
