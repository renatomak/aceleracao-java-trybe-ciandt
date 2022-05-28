package app.trybe.specialityapp.commons;

import app.trybe.specialityapp.service.exceptions.ResourceNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Response;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ResourceExceptionHandle {

  /**
   * Method controller advice.
   * 
   * @param e ResourceNotFoundException.
   * @param request HttpServletRequest.
   * @return ResponseEntity.
   */
  @ExceptionHandler(ResourceNotFoundException.class)
  public Response entityNotFound(ResourceNotFoundException e, HttpServletRequest request) {
    ApplicationError err = new ApplicationError(404, e.getMessage());

    return Response.status(Response.Status.NOT_FOUND).entity(err).build();
  }
}
