package com.trybe.calcularidade.service;

import com.trybe.calcularidade.domain.Idade;
import com.trybe.calcularidade.exception.ArgumentoIlegalException;
import com.trybe.calcularidade.exception.DataFuturaException;
import com.trybe.calcularidade.exception.DataInvalidaException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.stereotype.Service;

/**
 * Classe CalculadoraService.
 **/

@Service
public class CalculadoraService {

  /**
   * Method calcula idade.
   * 
   * @param date type String.
   * @return idade type Idade.
   * @throws ParseException exception.
   */
  // @CircuitBreaker(name = "idade", fallbackMethod = "fallback")
  public Idade calculaIdade(String date) throws ParseException {
    validDate(date);

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

    Calendar birthDate = Calendar.getInstance();
    birthDate.setTime(simpleDateFormat.parse(date));

    Calendar today = Calendar.getInstance();

    int month = (today.get(Calendar.YEAR) * 12 + today.get(Calendar.MONTH))
        - (birthDate.get(Calendar.YEAR) * 12 + birthDate.get(Calendar.MONTH));

    Idade idade = new Idade();

    int currentAge = month / 12;

    if (currentAge <= 0) {
      throw new DataFuturaException();
    }

    idade.setIdade(currentAge);

    return idade;
  }

  private void validDate(String date) {
    if (date.length() != 10) {
      throw new DataInvalidaException();
    }

    date = String.join("", date.split("-"));
    System.out.println(date);
    if (!date.matches("[+-]?\\d*(\\.\\d+)?")) {
      throw new ArgumentoIlegalException();
    }
  }

  private Idade fallback(RuntimeException e) {
    Idade idade = new Idade();
    idade.setIdade(0);
    return idade;
  }

}
