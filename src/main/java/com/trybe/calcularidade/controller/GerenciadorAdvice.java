package com.trybe.calcularidade.controller;

import com.trybe.calcularidade.exception.DataError;
import com.trybe.calcularidade.exception.DataFuturaException;
import com.trybe.calcularidade.exception.DataInvalidaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.text.ParseException;

/**
 * Classe GerenciadorAdvice.
 **/

@ControllerAdvice
public class GerenciadorAdvice {

    @ExceptionHandler({
            DataFuturaException.class,
            DataInvalidaException.class
    })
    public ResponseEntity<DataError> handlerBadRequest(RuntimeException exception) {
        DataError dataError = new DataError(exception.getMessage());
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(dataError);
    }

    public void handlerInternalServerError(Object any) {
    }

    @ExceptionHandler({
            ParseException.class
    })
    public ResponseEntity<DataError> handlerInternalServerError(ParseException exception) {
        DataError dataError = new DataError("Data não é número");
        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(dataError);
    }
}
