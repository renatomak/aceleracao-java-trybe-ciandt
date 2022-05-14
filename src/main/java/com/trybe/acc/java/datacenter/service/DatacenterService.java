package com.trybe.acc.java.datacenter.service;

import com.trybe.acc.java.datacenter.dao.DatacenterDao;
import com.trybe.acc.java.datacenter.entity.Datacenter;
import com.trybe.acc.java.datacenter.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;

public class DatacenterService implements ServiceInterface<Datacenter, Long> {

  @Override
  public void save(Datacenter datacenter) {
    EntityManager em = JpaUtil.getEntityManager();
    DatacenterDao servidorDao = new DatacenterDao(em);

    em.getTransaction().begin();

    servidorDao.cadastrar(datacenter);

    em.getTransaction().commit();
    em.close();

  }

  @Override
  public void update(Datacenter datacenter) {
    EntityManager em = JpaUtil.getEntityManager();
    DatacenterDao datacenterDao = new DatacenterDao(em);

    em.getTransaction().begin();

    datacenterDao.atualizar(datacenter);

    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = JpaUtil.getEntityManager();
    DatacenterDao datacenterDao = new DatacenterDao(em);

    em.getTransaction().begin();

    Datacenter servidor = datacenterDao.buscarPorId(1L);

    datacenterDao.remover(servidor);

    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Datacenter> list() {
    EntityManager em = JpaUtil.getEntityManager();
    DatacenterDao datacenterDao = new DatacenterDao(em);

    List<Datacenter> datacenters = datacenterDao.buscarTodos();

    em.close();
    return datacenters;
  }

  @Override
  public Datacenter findById(Long id) {
    EntityManager em = JpaUtil.getEntityManager();
    DatacenterDao datacenterDao = new DatacenterDao(em);

    Datacenter datacenter = datacenterDao.buscarPorId(1L);

    em.close();

    return datacenter;
  }
}
