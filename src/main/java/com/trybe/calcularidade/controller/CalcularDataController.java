package com.trybe.calcularidade.controller;

import com.trybe.calcularidade.domain.Idade;
import com.trybe.calcularidade.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * Classe CalcularDataController.
 **/

@RestController
@RequestMapping("/")
public class CalcularDataController {

    @Autowired
  private CalculadoraService service;


  @GetMapping
  public ResponseEntity<Idade> calculaIdade(@RequestParam String data) throws ParseException {
      return ResponseEntity.ok(service.calculaIdade(data));
  }

}
