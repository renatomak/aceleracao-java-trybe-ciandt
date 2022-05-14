package com.trybe.acc.java.datacenter.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

  private static final EntityManagerFactory FACTORY =
      Persistence.createEntityManagerFactory("com.trybe.acc.java.hibernate.datacenter");

  public static EntityManager getEntityManager() {
    return FACTORY.createEntityManager();
  }

}
