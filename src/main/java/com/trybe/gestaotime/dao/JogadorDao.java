package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Jogador;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class JogadorDao extends GenericDao<Jogador, Integer> {
  @Override
  public void salvar(Jogador entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.persist(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void editar(Jogador entity) {
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();
    em.merge(entity);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public void deletar(Integer id) {
    EntityManager em = emf.createEntityManager();

    Jogador toBeDeleted = em.find(Jogador.class, id);
    if (toBeDeleted == null) {
      return;
    }

    em.getTransaction().begin();
    em.remove(toBeDeleted);
    em.getTransaction().commit();

    em.close();
  }

  @Override
  public List<Jogador> listar() {
    EntityManager em = emf.createEntityManager();

    Query query = em.createQuery("from Jogador");

    return query.getResultList();
  }

  @Override
  public Jogador findById(Integer id) {
    EntityManager em = emf.createEntityManager();
    return em.find(Jogador.class, id);
  }
}
