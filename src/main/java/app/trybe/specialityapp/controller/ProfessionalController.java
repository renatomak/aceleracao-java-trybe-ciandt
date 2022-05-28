package app.trybe.specialityapp.controller;

import app.trybe.specialityapp.commons.ResponseMessage;
import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.service.ProfessionalService;
import java.util.List;
import javax.ws.rs.*;
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
    return Response.status(Response.Status.CREATED).entity(ResponseMessage.MSG_CREATED).build();
  }

  @PUT
  @Path("/edit/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response edit(@PathParam("id") Integer id, Professional professional) {
    // professionalService.edit(id, professional);
    return Response.ok(ResponseMessage.MSG_EDIT(id)).build();
  }

  @DELETE
  @Path("/delete/{id}")
  @Produces("application/json")
  public Response delete(@PathParam("id") Integer id) {
    professionalService.delete(id);
    return Response.ok(ResponseMessage.MSG_DELETE(id)).build();
  }

}
