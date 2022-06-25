package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.repository.ProdutoRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


@ApplicationScoped
public class ProdutoService {

  @Inject
  private ProdutoRepository repository;

  // public List<ProdutoResponseDto> getProdutos() {
  //// return repository.listAll().stream().map(x -> new ProdutoResponseDto(x));
  // }

}
