package com.trybe.acc.java.sistemadevotacao;

public class PessoaCandidata extends Pessoa {

  private Integer numero;
  private Integer votos;

  /**
   * constructor.
   * @param nome string
   * @param numero integer
   */
  public PessoaCandidata(String nome, Integer numero) {
    super(nome);
    this.numero = numero;
    this.votos = 0;
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

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Integer getVotos() {
    return votos;
  }

  public void setVotos(Integer votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos += 1;
  }

  @Override
  public String toString() {
    return "PessoaCandidata [nome= " + this.nome + " numero= " + numero + ", votos=" + votos + "]";
  }

}
