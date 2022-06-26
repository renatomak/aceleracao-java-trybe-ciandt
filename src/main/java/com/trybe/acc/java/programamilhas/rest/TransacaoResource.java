package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.dao.PessoaDao;
import com.trybe.acc.java.programamilhas.dto.TransferenciaDto;
import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.service.ContaService;
import com.trybe.acc.java.programamilhas.util.TokenUtil;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/admin")
@ApplicationScoped
public class TransacaoResource {


  @Inject
  TokenUtil tokenUtil;

  @Inject
  PessoaDao pessoaDao;

  @Inject
  private ContaService contaService;

  // TODO: incompleto
  @POST
  @Path("/transferencia")
  public Response createTransacao(@QueryParam(value = "token") String token, TransferenciaDto dto)
          throws AcessoNaoAutorizadoException {
    return Response.ok(contaService.getExtrato(token)).build();
  }

}
