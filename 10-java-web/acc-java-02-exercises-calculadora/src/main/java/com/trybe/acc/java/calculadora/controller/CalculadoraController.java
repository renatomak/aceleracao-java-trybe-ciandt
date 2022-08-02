package com.trybe.acc.java.calculadora.controller;

import com.trybe.acc.java.calculadora.dto.PayloadDto;
import com.trybe.acc.java.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class CalculadoraController {

  @Autowired
  private CalculadoraService service;


  @GetMapping
  public ResponseEntity<PayloadDto> calculaIdade(@RequestParam Integer primeiroValor,
      @RequestParam Integer segundoValor, @RequestParam String operacao) {
    return ResponseEntity.ok(service.calculadora(primeiroValor, segundoValor, operacao));
  }
}
