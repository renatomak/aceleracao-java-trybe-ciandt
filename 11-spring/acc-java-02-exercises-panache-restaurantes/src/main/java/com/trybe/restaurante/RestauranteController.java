package com.trybe.restaurante;

import com.trybe.restaurante.dto.RestauranteDto;
import com.trybe.restaurante.service.RestauranteService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/restaurante")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestauranteController {

  @Inject
  private RestauranteService restauranteService;

  @POST
  public Response salvar(RestauranteDto dto) {
    return Response.status(Response.Status.CREATED).entity(restauranteService.salvar(dto)).build();
  }

  @GET
  public List<RestauranteDto> listar() {
    return restauranteService.listar();
  }

  @GET
  @Path("/{id}")
  public Response buscarPorId(@PathParam("id") Long id) {
    return Response.ok(restauranteService.buscarPorId(id)).build();
  }

  @PATCH
  @Path("/{id}")
  public Response atualizar(@PathParam("id") Long id, RestauranteDto dto) {
    return Response.status(Response.Status.OK)
            .entity(restauranteService.atualizar(id, dto)).build();
  }

  @DELETE
  @Path("/{id}")
  public Response deletar(@PathParam("id") Long id) {
    restauranteService.deletar(id);
    return Response.status(Response.Status.NO_CONTENT).build();
  }
}
