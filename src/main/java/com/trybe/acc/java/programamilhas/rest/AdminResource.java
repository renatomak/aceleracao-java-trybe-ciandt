package com.trybe.acc.java.programamilhas.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/admin")
@ApplicationScoped
public class AdminResource {
  // TODO: incompleto
  @POST
  @Path("/saldos")
  public Response saldos(@QueryParam(value = "token") String token) {
    return null;
  }
}
