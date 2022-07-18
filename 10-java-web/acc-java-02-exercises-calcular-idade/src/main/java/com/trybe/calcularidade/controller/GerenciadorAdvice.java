package com.trybe.calcularidade.controller;

import com.trybe.calcularidade.exception.ArgumentoIlegalException;
import com.trybe.calcularidade.exception.DataError;
import com.trybe.calcularidade.exception.DataFuturaException;
import com.trybe.calcularidade.exception.DataInvalidaException;
import java.text.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



/**
 * Classe GerenciadorAdvice.
 **/

@ControllerAdvice
public class GerenciadorAdvice {

  @ExceptionHandler({DataFuturaException.class, DataInvalidaException.class})
  public ResponseEntity<DataError> handlerBadRequest(RuntimeException exception) {
    DataError dataError = new DataError(exception.getMessage());
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(dataError);
  }

  @ExceptionHandler({ArgumentoIlegalException.class})
  public ResponseEntity<DataError> handlerInternalServerError(RuntimeException exception) {
    DataError dataError = new DataError(exception.getMessage());
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dataError);
  }
}
