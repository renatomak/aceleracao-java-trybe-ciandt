package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dto.PessoaRequestDto;
import com.trybe.acc.java.programamilhas.dto.PessoaResponseDto;
import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.repository.PessoaRepository;
import com.trybe.acc.java.programamilhas.util.HashUtil;
import com.trybe.acc.java.programamilhas.util.TokenUtil;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;


@ApplicationScoped
public class PessoaService {

  @Inject
  private PessoaRepository repository;

  /**
   * Method crate Pessoa.
   * 
   * @param dto type PessoaRequestDto.
   * @return pessoaResponseDto type PessoaResponseDto.
   * @throws InvalidKeySpecException type exception.
   * @throws NoSuchAlgorithmException type exception.
   */
  @Transactional
  public PessoaResponseDto create(PessoaRequestDto dto)
      throws InvalidKeySpecException, NoSuchAlgorithmException {
    Pessoa entity = new Pessoa();
    HashUtil util = new HashUtil();

    entity.setLogin(dto.getLogin());
    entity.setHash(util.hash(dto.getSenha()));
    repository.persist(entity);

    return new PessoaResponseDto(dto.getLogin());
  }

  /**
   * Method delte Pessoa.
   *
   * @param token type String.
   * @throws AcessoNaoAutorizadoException type exception.
   */
  public void delete(String token) throws AcessoNaoAutorizadoException {
    TokenUtil util = new TokenUtil();
    Integer id = util.obterIdUsuario(token);
    repository.deleteById(id);
  }
}
