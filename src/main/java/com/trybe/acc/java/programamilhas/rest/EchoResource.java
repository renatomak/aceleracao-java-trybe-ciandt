package com.trybe.acc.java.programamilhas.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/echo")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
public class EchoResource {

  @GET
  public Response echo() {
    return Response.ok("Olá!").build();
  }
}
