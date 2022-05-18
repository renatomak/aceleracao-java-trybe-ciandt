package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Time;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TimeDao extends GenericDao<Time, Integer> {

  @Override
  public void salvar(Time entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void editar(Time entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void deletar(Integer id) {
    EntityManager em = emf.createEntityManager();

    Time toBeDeleted = em.find(Time.class, id);
    if (toBeDeleted == null) {
      return;
    }

    em.getTransaction().begin();
    em.remove(toBeDeleted);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Time> listar() {
    EntityManager em = emf.createEntityManager();

    Query query = em.createQuery("from Time");

    return query.getResultList();
  }

  @Override
  public Time findById(Integer id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Time.class, id);
  }

}
