package com.trybe.acc.java.programamilhas.repository;

import com.trybe.acc.java.programamilhas.model.Pessoa;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PessoaRepository implements PanacheRepositoryBase<Pessoa, Integer> {
}
