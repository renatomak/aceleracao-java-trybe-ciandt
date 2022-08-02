package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.service.ContaService;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/conta")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContaResource {

  @Inject
  private ContaService contaService;


  @GET
  @Path("/saldo")
  public Response getSaldo(@QueryParam(value = "token") String token)
          throws AcessoNaoAutorizadoException {
    return Response.ok(contaService.getSaldo(token)).build();
  }

  @GET
  @Path("/extrato")
  public Response getExtrato(@QueryParam(value = "token") String token)
          throws AcessoNaoAutorizadoException {
    return Response.ok(contaService.getExtrato(token)).build();
  }
}