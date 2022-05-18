package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Torcedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class TorcedorDao extends GenericDao<Torcedor, Integer> {

  @Override
  public void salvar(Torcedor entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void editar(Torcedor entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void deletar(Integer id) {
    EntityManager em = emf.createEntityManager();

    Torcedor toBeDeleted = em.find(Torcedor.class, id);
    if (toBeDeleted == null) {
      return;
    }

    em.getTransaction().begin();
    em.remove(toBeDeleted);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Torcedor> listar() {
    EntityManager em = emf.createEntityManager();

    Query query = em.createQuery("from Torcedor");

    return query.getResultList();
  }

  @Override
  public Torcedor findById(Integer id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Torcedor.class, id);
  }

}
