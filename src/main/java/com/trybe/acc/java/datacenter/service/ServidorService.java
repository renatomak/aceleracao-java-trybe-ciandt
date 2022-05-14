package com.trybe.acc.java.datacenter.service;

import com.trybe.acc.java.datacenter.dao.ServidorDao;
import com.trybe.acc.java.datacenter.entity.Servidor;
import com.trybe.acc.java.datacenter.util.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;

public class ServidorService implements ServiceInterface<Servidor, Long> {

  @Override
  public void save(Servidor servidor) {
    EntityManager em = JpaUtil.getEntityManager();
    ServidorDao servidorDao = new ServidorDao(em);

    em.getTransaction().begin();

    servidorDao.cadastrar(servidor);

    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void update(Servidor servidor) {
    EntityManager em = JpaUtil.getEntityManager();
    ServidorDao servidorDao = new ServidorDao(em);

    em.getTransaction().begin();

    servidorDao.atualizar(servidor);

    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = JpaUtil.getEntityManager();
    ServidorDao servidorDao = new ServidorDao(em);

    em.getTransaction().begin();

    Servidor servidor = servidorDao.buscarPorId(1L);

    servidorDao.remover(servidor);

    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Servidor> list() {
    EntityManager em = JpaUtil.getEntityManager();
    ServidorDao servidorDao = new ServidorDao(em);

    List<Servidor> servidores = servidorDao.buscarTodos();

    em.close();
    return servidores;
  }

  @Override
  public Servidor findById(Long id) {
    EntityManager em = JpaUtil.getEntityManager();
    ServidorDao servidorDao = new ServidorDao(em);

    Servidor servidor = servidorDao.buscarPorId(1L);

    em.close();

    return servidor;
  }
}
