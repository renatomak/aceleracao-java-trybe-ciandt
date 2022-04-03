package com.trybe.acc.java.sistemadevotacao;

public class PessoaEleitora extends Pessoa {
  
  private String cpf;

  public PessoaEleitora(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  String getNome() {
    // TODO Auto-generated method stub
    return this.nome;
  }

  @Override
  void setNome(String nome) {
    // TODO Auto-generated method stub
    this.nome = nome;
  }
  
  
}
