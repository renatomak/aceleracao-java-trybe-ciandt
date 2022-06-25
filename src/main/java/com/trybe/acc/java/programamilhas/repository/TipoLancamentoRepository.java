package com.trybe.acc.java.programamilhas.repository;

import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TipoLancamentoRepository implements PanacheRepositoryBase<TipoLancamento, Integer> {
}
