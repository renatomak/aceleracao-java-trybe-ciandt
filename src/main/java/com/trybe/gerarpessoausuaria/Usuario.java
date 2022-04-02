package com.trybe.gerarpessoausuaria;

public class Usuario extends Pessoa {

  public Usuario(String nome, String sobrenome) {
    super(nome, sobrenome);
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   *
   */
  public String getUsuario() {
    String nome = this.nome;
    String sobrenome = this.sobrenome;

    if (nome != null && nome.trim() != "" && sobrenome != null && sobrenome.trim() != "") {
      return String.format("%s.%s", nome, sobrenome);
    }
    return "Usuário inválido";

  }
}
