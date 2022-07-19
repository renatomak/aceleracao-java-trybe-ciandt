package com.trybe.acc.java.calculadora.service;

import com.trybe.acc.java.calculadora.dto.PayloadDto;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

  /**
   * Methodo for calc.
   * 
   * @param primeiroValor type Integer.
   * @param segundoValor  type Integer.
   * @param operacao  type String.
   * @return result type PayLoadDto.
   */
  public PayloadDto calculadora(Integer primeiroValor, Integer segundoValor, String operacao) {

    if (operacao.equals("ADICAO")) {
      return new PayloadDto(primeiroValor + segundoValor);
    }

    if (operacao.equals("SUBTRACAO")) {
      return new PayloadDto(primeiroValor - segundoValor);
    }

    if (operacao.equals("MULTIPLICACAO")) {
      return new PayloadDto(primeiroValor * segundoValor);
    }

    if (operacao.equals("DIVISAO")) {
      if (segundoValor == 0) {
        return new PayloadDto(0);
      }

      return new PayloadDto(primeiroValor / segundoValor);
    }

    return new PayloadDto(0);
  }
}
