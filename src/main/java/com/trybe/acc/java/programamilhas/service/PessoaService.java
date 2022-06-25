package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.PessoaDao;
import com.trybe.acc.java.programamilhas.dto.LoginDto;
import com.trybe.acc.java.programamilhas.model.Pessoa;
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
  private PessoaDao pessoaDao;



  @Inject
  private TokenUtil tokenUtil;

  /**
   * Method crate Pessoa.
   * 
   * @param dto type PessoaRequestDto.
   * @throws InvalidKeySpecException type exception.
   * @throws NoSuchAlgorithmException type exception.
   */
  @Transactional
  public void create(LoginDto dto)
      throws InvalidKeySpecException, NoSuchAlgorithmException {
    Pessoa entity = new Pessoa();
    HashUtil util = new HashUtil();

    entity.setLogin(dto.getLogin());
    entity.setHash(util.hash(dto.getSenha()));
    pessoaDao.salve(entity);
  }

  // /**
  // * Method delte Pessoa.
  // *
  // * @param token type String.
  // * @throws AcessoNaoAutorizadoException type exception.
  // */
  // public void delete(String token) throws AcessoNaoAutorizadoException {
  // Integer id = tokenUtil.obterIdUsuario(token);
  // repository.deleteById(id);
  // }
}
