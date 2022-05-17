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

    Query query = em.createQuery("from Aplicacao");

    return query.getResultList();
    // EntityManager em = emf.createEntityManager();
    //
    // CriteriaBuilder cb = em.getCriteriaBuilder();
    // CriteriaQuery<Aplicacao> cq = cb.createQuery(Aplicacao.class);
    // Root<Aplicacao> rootEntry = cq.from(Aplicacao.class);
    // CriteriaQuery<Aplicacao> all = cq.select(rootEntry);
    //
    // TypedQuery<Aplicacao> allQuery = em.createQuery(all);


    // EntityManager em = emf.createEntityManager();
    //
    // Aplicacao entity = em.find(Aplicacao.class, 1L);
    // List<Aplicacao> list = new ArrayList<>();
    // list.add(entity);
    // entity = em.find(Aplicacao.class, 2L);
    // list.add(entity);
    // entity = em.find(Aplicacao.class, 3L);
    // list.add(entity);

    // return list;
  }

  @Override
  public Aplicacao findById(Long id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Aplicacao.class, id);
  }
}
