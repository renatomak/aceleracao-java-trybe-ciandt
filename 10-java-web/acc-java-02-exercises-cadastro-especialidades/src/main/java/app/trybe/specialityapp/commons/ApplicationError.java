package app.trybe.specialityapp.commons;

import javax.ws.rs.core.Response;

public class ApplicationError {

  private Response.Status status;
  private String message;

  public ApplicationError(Response.Status status, String message) {
    this.status = status;
    this.message = message;
  }

  public Response.Status getStatus() {
    return status;
  }

  public void setStatus(Response.Status status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
