package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dto.TipoLancamentoDto;
import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.repository.ParceiroRepository;
import com.trybe.acc.java.programamilhas.repository.ProdutoRepository;
import com.trybe.acc.java.programamilhas.repository.TipoLancamentoRepository;

import java.util.List;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;


@ApplicationScoped
public class DominioService {

  @Inject
  private TipoLancamentoRepository tipoLancamentoRepository;

  @Inject
  private ProdutoRepository produtoRepository;

  @Inject
  private ParceiroRepository parceiroRepository;

  /**
   * Method crate TipoLancamento.
   *
   * @return pessoaResponseDto type TipoLancamentoDto.
   */
  @Transactional
  public List<TipoLancamentoDto> listTipoLancamentos() {
    return tipoLancamentoRepository.findAll().stream().map(TipoLancamentoDto::new).collect(Collectors.toList());
  }

  @Transactional
  public List<Produto> listProdutos() {
    return produtoRepository.listAll();
  }

  @Transactional
  public List<Parceiro> listParceiros() {
    return parceiroRepository.listAll();
  }

}
