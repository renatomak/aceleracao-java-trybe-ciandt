package com.trybe.acc.java.datacenter.dao;

import com.trybe.acc.java.datacenter.entity.Aplicacao;
import java.util.List;
import javax.persistence.EntityManager;

public class AplicacaoDao {
  private EntityManager em;

  public AplicacaoDao(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Aplicacao servidor) {
    this.em.persist(servidor);
  }

  public void atualizar(Aplicacao servidor) {
    this.em.merge(servidor);
  }

  public void remover(Aplicacao servidor) {
    servidor = em.merge(servidor);
    this.em.remove(servidor);
  }

  public Aplicacao buscarPorId(Long id) {
    return em.find(Aplicacao.class, id);
  }

  public List<Aplicacao> buscarTodos() {
    String jpql = "SELECT p FROM Aplicacao p";
    return em.createQuery(jpql, Aplicacao.class).getResultList();
  }
}
