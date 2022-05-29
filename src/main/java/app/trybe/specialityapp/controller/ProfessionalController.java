package app.trybe.specialityapp.controller;

import static app.trybe.specialityapp.commons.ResponseMessage.deleteMessageSuccess;
import static app.trybe.specialityapp.commons.ResponseMessage.editMessageSuccess;
import static app.trybe.specialityapp.commons.ResponseMessage.insertMessageSuccess;

import app.trybe.specialityapp.commons.ApplicationError;
import app.trybe.specialityapp.commons.ResponseMessage;
import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.service.ProfessionalService;
import app.trybe.specialityapp.service.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
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
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;


@Controller
@Path("/professional")
public class ProfessionalController {

  @Autowired
  private ProfessionalService professionalService;


  /**
   * Method findAll Professional.
   *
   * @return ResponseEntity type Professional.
   */
  @GET
  @Path("/all")
  @Produces("application/json")
  public Response findAll() {
    try {
      List<Professional> professionals = professionalService.findAll();
      return Response.ok(professionals).build();
    } catch (ResourceNotFoundException e) {
      ApplicationError err = new ApplicationError(Response.Status.NOT_FOUND, e.getMessage());
      return Response.status(Response.Status.NOT_FOUND).entity(err).build();
    }

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
    try {
      professionalService.insert(professional);
      return Response.status(Response.Status.CREATED).entity(insertMessageSuccess).build();
    } catch (ResourceNotFoundException e) {
      ApplicationError err =
          new ApplicationError(Response.Status.BAD_REQUEST, ResponseMessage.mensageErroExplicitId);
      return Response.status(Response.Status.BAD_REQUEST).entity(err).build();
    }
  }

  /**
   * Method edit exist Professional.
   * 
   * @param id type Integer.
   * @param professional type Professional.
   * @return ResponseEntity type Professional.
   */
  @PUT
  @Path("/edit/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response edit(@PathParam("id") Integer id, Professional professional) {
    try {
      professionalService.edit(id, professional);
      return Response.ok(editMessageSuccess(id)).build();
    } catch (NoSuchElementException e) {
      ApplicationError err = new ApplicationError(Response.Status.NOT_FOUND,
          ResponseMessage.mensageErroEditDoNotExist);
      return Response.status(Response.Status.NOT_FOUND).entity(err).build();
    }
  }
  
  /**
   * Method delete Professional.
   *
   * @param id type Integer.
   * @return Response type response.
   */
  @DELETE
  @Path("/delete/{id}")
  @Produces("application/json")
  public Response delete(@PathParam("id") Integer id) {
    try {
      professionalService.delete(id);
      return Response.ok(deleteMessageSuccess(id)).build();
    } catch (EmptyResultDataAccessException e) {
      ApplicationError err = new ApplicationError(Response.Status.NOT_FOUND,
          ResponseMessage.mensageErroDeleteDoNotExist);
      return Response.status(Response.Status.NOT_FOUND).entity(err).build();
    }
  }

}
