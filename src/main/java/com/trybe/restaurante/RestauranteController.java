package com.trybe.restaurante;

import com.trybe.restaurante.dto.RestauranteDto;
import com.trybe.restaurante.service.RestauranteService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
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
}
