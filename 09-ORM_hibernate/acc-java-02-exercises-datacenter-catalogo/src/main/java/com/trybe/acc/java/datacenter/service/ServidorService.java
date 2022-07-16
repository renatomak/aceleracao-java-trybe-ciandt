package com.trybe.acc.java.datacenter.service;

import com.trybe.acc.java.datacenter.entity.Servidor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class ServidorService implements ServiceInterface<Servidor, Long> {

  @Override
  public void save(Servidor entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void update(Servidor entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = emf.createEntityManager();

    Servidor toBeDeleted = em.find(Servidor.class, id);

    em.getTransaction().begin();
    em.remove(toBeDeleted);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Servidor> list() {
    EntityManager em = emf.createEntityManager();

    Query query = em.createQuery("from Servidor");

    return query.getResultList();
  }

  @Override
  public Servidor findById(Long id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Servidor.class, id);
  }
}
