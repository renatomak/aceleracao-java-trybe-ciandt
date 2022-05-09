package com.trybe.acc.java.sistemarh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaColaboradoraTest {

  private PessoaColaboradora pessoaColaboradora;

  private int ano;
  @BeforeEach
  public void setUp() {
    pessoaColaboradora = new PessoaColaboradora();
    pessoaColaboradora.setSalarioBruto(3000);
    ano = 3;
  }

  @Test
  @DisplayName("10. Teste da função que calcula o salário liquido.")
  public void testeCalcularSalarioLiquido() {
    Assertions.assertEquals(2400, pessoaColaboradora.calcularSalarioLiquido());
  }

  @Test
  @DisplayName("11. Teste da função que calcula valor bruto recebido em dada quantidade de anos.")
  public void testeCalcularValorBrutoRecebidoAnual() {
    Assertions.assertEquals(108000, pessoaColaboradora.calcularValorBrutoRecebidoAnual(ano));
  }

  @Test
  @DisplayName("12. Teste da função que calcula valor liquido recebido em dada quantidade de anos.")
  public void testeCalcularValorLiquidoRecebidoAnual() {
    Assertions.assertEquals(86400, pessoaColaboradora.calcularValorLiquidoRecebidoAnual(ano));
  }

  @Test
  @DisplayName("13. Teste da função que calcula valor de imposto anul.")
  public void testeCalcularValorImpostoAnual() {
    Assertions.assertEquals(21600, pessoaColaboradora.calcularValorImpostoAnual(ano));
  }

  @Test
  @DisplayName("14. Teste da função que calcula valor de imposto anul.")
  public void testegetSalarioBruto() {
    Assertions.assertEquals(3000, pessoaColaboradora.getSalarioBruto());
  }

}
