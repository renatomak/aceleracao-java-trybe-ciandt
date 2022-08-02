package com.trybe.listaprodutos;

import com.trybe.listaprodutos.model.Produto;
import com.trybe.listaprodutos.service.EstoqueService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/estoque")
public class EstoqueController {

  @Inject
  private EstoqueService estoqueService;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Produto> findAll() {
    return estoqueService.listar();
  }

  @GET
  @Path("/{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public Produto findById(@PathParam("id") Integer id) {
    return estoqueService.buscarPorId(id);
  }

}
