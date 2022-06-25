package com.trybe.acc.java.programamilhas.repository;

import com.trybe.acc.java.programamilhas.model.Lancamento;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LancamentoRepository implements PanacheRepositoryBase<Lancamento, Integer> {
}
