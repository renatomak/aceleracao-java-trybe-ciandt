package com.trybe.polimorfismo;

public class FuncionarioPessoaFisica extends Funcionario {


  @Override
  public double calcularSalarioLiquido() {
    // TODO Auto-generated method stub

    return this.getSalarioBruto() - (this.getSalarioBruto() * 0.2);
  }

}
