package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.dao.PessoaDao;
import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.service.LancamentoService;
import com.trybe.acc.java.programamilhas.util.TokenUtil;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/admin")
@ApplicationScoped
public class LancamentoResource {


  @Inject
  TokenUtil tokenUtil;

  @Inject
  PessoaDao pessoaDao;

  @Inject
  private LancamentoService lancamentoService;

  // TODO: incompleto
  @POST
  @Path("/saldos")
  public Response saldos(@QueryParam(value = "token") String token)
          throws AcessoNaoAutorizadoException {
    return Response.ok(lancamentoService.listSaldos(token)).build();
  }

}
