package com.trybe.polimorfismo;

public class FuncionarioPessoaJuridica extends Funcionario {

  @Override
  public double calcularSalarioLiquido() {
    // TODO Auto-generated method stub
    return this.getSalarioBruto() - (this.getSalarioBruto() * 0.1);
  }

}
