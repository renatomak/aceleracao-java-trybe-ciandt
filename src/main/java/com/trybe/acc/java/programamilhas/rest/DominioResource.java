package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.service.DominioService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/dominio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DominioResource {

  @Inject
  private DominioService dominioService;

  @GET
  @Path("/tipolancamento")
  public Response listTipoLancamentos() {
    return Response.ok(dominioService.listTipoLancamentos()).build();
  }

  @GET
  @Path("/produto")
  public Response listProdutos() {
    return Response.ok(dominioService.listProdutos()).build();
  }

  @GET
  @Path("/parceiro")
  public Response listParceiros() {
    return Response.ok(dominioService.listParceiros()).build();
  }

}
