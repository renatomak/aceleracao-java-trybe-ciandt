package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.dto.LoginDto;
import com.trybe.acc.java.programamilhas.exception.AcessoNaoAutorizadoException;
import com.trybe.acc.java.programamilhas.service.PessoaService;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/pessoa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PessoaResource {

  @Inject
  private PessoaService service;


  @POST
  public Response salvar(LoginDto dto)
      throws InvalidKeySpecException, NoSuchAlgorithmException {
    service.create(dto);
    return Response.status(Response.Status.OK).build();
  }

  @DELETE
  public Response delete(@QueryParam(value = "token") String token)
      throws AcessoNaoAutorizadoException {
    service.delete(token);
    return Response.ok().build();
  }
}
