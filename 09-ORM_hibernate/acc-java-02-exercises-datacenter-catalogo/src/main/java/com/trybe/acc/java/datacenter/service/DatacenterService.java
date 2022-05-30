package com.trybe.acc.java.datacenter.service;

import com.trybe.acc.java.datacenter.entity.Datacenter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DatacenterService implements ServiceInterface<Datacenter, Long> {

  @Override
  public void save(Datacenter entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void update(Datacenter entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = emf.createEntityManager();

    Datacenter toBeDeleted = em.find(Datacenter.class, id);

    em.getTransaction().begin();
    em.remove(toBeDeleted);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Datacenter> list() {
    EntityManager em = emf.createEntityManager();

    Query query = em.createQuery("from Datacenter");

    return query.getResultList();
  }

  @Override
  public Datacenter findById(Long id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Datacenter.class, id);
  }
}
