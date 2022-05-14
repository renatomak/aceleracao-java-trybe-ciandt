package com.trybe.acc.java.datacenter.dao;

import com.trybe.acc.java.datacenter.entity.Servidor;
import java.util.List;
import javax.persistence.EntityManager;


public class ServidorDao {

  private EntityManager em;

  public ServidorDao(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Servidor servidor) {
    this.em.persist(servidor);
  }

  public void atualizar(Servidor servidor) {
    this.em.merge(servidor);
  }

  public void remover(Servidor servidor) {
    servidor = em.merge(servidor);
    this.em.remove(servidor);
  }

  public Servidor buscarPorId(Long id) {
    return em.find(Servidor.class, id);
  }

  public List<Servidor> buscarTodos() {
    String jpql = "SELECT p FROM Servidor p";
    return em.createQuery(jpql, Servidor.class).getResultList();
  }
}
