package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.service.ContaService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/admin")
@ApplicationScoped
public class ContaAdminResource {

  @Inject
  private ContaService contaService;


  @POST
  @Path("/saldos")
  public Response getAllSaldos(@QueryParam(value = "token") String token)
          throws AcessoNaoAutorizadoException {
    return Response.ok(contaService.getAllSaldos(token)).build();
  }

}
