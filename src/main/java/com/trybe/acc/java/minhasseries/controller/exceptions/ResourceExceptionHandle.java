package com.trybe.acc.java.minhasseries.controller.exceptions;

import com.trybe.acc.java.minhasseries.service.exceptions.ResourceNotFoundException;
import com.trybe.acc.java.minhasseries.service.exceptions.SerieExistenteException;
import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandle {

  /**
   * Method exception handle.
   * 
   * @param e type ResourceNotFoundException.
   * @param request type HttpServletRequest.
   * @return ResponseEntity type StandardError.
   */
  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e,
      HttpServletRequest request) {
    StandardError err = new StandardError();
    HttpStatus status = HttpStatus.NOT_FOUND;

    err.setTimestamp(LocalDateTime.now());
    err.setStatus(status.value());
    err.setError("Entity not found.");
    err.setMessage(e.getMessage());
    err.setPath(request.getRequestURI());
    return ResponseEntity.status(status).body(err);
  }

  /**
   * Method exception handle.
   *
   * @param e type ResourceNotFoundException.
   * @param request type HttpServletRequest.
   * @return ResponseEntity type StandardError.
   */
  @ExceptionHandler(SerieExistenteException.class)
  public ResponseEntity<StandardError> serieCadastrada(SerieExistenteException e,
      HttpServletRequest request) {
    StandardError err = new StandardError();
    HttpStatus status = HttpStatus.CONFLICT;

    err.setTimestamp(LocalDateTime.now());
    err.setStatus(status.value());
    err.setError(e.getMessage());
    err.setMessage(e.getMessage());
    err.setPath(request.getRequestURI());
    return ResponseEntity.status(status).body(err);
  }
}
