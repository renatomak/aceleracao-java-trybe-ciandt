package com.trybe.acc.java.programamilhas.dto;

public class PessoaResponseDto {
  private String login;

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public PessoaResponseDto(String login) {
    this.login = login;
  }

  public PessoaResponseDto() {}
}
