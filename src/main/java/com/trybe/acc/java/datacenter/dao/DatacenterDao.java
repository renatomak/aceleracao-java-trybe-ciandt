package com.trybe.acc.java.datacenter.dao;

import com.trybe.acc.java.datacenter.entity.Datacenter;
import java.util.List;
import javax.persistence.EntityManager;

public class DatacenterDao {
  private EntityManager em;

  public DatacenterDao(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Datacenter datacenter) {
    this.em.persist(datacenter);
  }

  public void atualizar(Datacenter datacenter) {
    this.em.merge(datacenter);
  }

  public void remover(Datacenter datacenter) {
    datacenter = em.merge(datacenter);
    this.em.remove(datacenter);
  }

  public Datacenter buscarPorId(Long id) {
    return em.find(Datacenter.class, id);
  }

  public List<Datacenter> buscarTodos() {
    String jpql = "SELECT p FROM Datacenter p";
    return em.createQuery(jpql, Datacenter.class).getResultList();
  }
}
