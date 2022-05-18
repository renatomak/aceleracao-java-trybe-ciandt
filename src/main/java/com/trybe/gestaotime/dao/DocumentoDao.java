package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Documento;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class DocumentoDao extends GenericDao<Documento, Integer> {

  @Override
  public void salvar(Documento entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void editar(Documento entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void deletar(Integer id) {
    EntityManager em = emf.createEntityManager();

    Documento toBeDeleted = em.find(Documento.class, id);
    if (toBeDeleted == null) {
      return;
    }

    em.getTransaction().begin();
    em.remove(toBeDeleted);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Documento> listar() {
    EntityManager em = emf.createEntityManager();

    Query query = em.createQuery("from Documento");

    return query.getResultList();
  }

  @Override
  public Documento findById(Integer id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Documento.class, id);
  }

}
