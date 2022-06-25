package com.trybe.acc.java.programamilhas.repository;

import com.trybe.acc.java.programamilhas.model.Parceiro;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ParceiroRepository implements PanacheRepositoryBase<Parceiro, Integer> {
}
