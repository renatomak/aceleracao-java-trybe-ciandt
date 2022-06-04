package com.trybe.calcularidade.service;

import com.trybe.calcularidade.domain.Idade;
import com.trybe.calcularidade.exception.DataFuturaException;
import com.trybe.calcularidade.exception.DataInvalidaException;
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
  public Idade calculaIdade(String date) throws ParseException {

    if (date.length() != 10) {
      throw new DataInvalidaException("Data Inválida");
    }

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

}
