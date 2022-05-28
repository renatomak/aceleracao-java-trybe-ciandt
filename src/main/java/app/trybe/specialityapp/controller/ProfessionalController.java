package app.trybe.specialityapp.controller;

import static app.trybe.specialityapp.commons.ResponseMessage.deleteMessageSuccess;
import static app.trybe.specialityapp.commons.ResponseMessage.editMessageSuccess;
import static app.trybe.specialityapp.commons.ResponseMessage.insertMessageSuccess;

import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.service.ProfessionalService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
@Path("/professional")
public class ProfessionalController {

  @Autowired
  private ProfessionalService professionalService;


  @GET
  @Path("/all")
  @Produces("application/json")
  public Response findAll() {
    List<Professional> professionals = professionalService.findAll();
    return Response.ok(professionals).build();
  }

  @GET
  @Path("/{id}")
  @Produces("application/json")
  public Response findById(@PathParam("id") Integer id) {
    return Response.ok(professionalService.findById(id)).build();
  }

  /**
   * Method insert new Professional.
   *
   * @param professional type Professional.
   * @return ResponseEntity type Professional.
   */
  @POST
  @Path("/add")
  @Consumes("application/json")
  @Produces("application/json")
  public Response insert(Professional professional) {
    professionalService.insert(professional);
    return Response.status(Response.Status.CREATED).entity(insertMessageSuccess).build();
  }

  @PUT
  @Path("/edit/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response edit(@PathParam("id") Integer id, Professional professional) {
    professionalService.edit(id, professional);
    return Response.ok(editMessageSuccess(id)).build();
  }

  @DELETE
  @Path("/delete/{id}")
  @Produces("application/json")
  public Response delete(@PathParam("id") Integer id) {
    professionalService.delete(id);
    return Response.ok(deleteMessageSuccess(id)).build();
  }

}
