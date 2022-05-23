package com.trybe.gestaotime.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Documento implements Serializable {
  private static final long serialVersionUID = -1218716574182330157L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String cpf;

  private String numeroCarteiraTrabalho;

  private String numeroCbf;

  @OneToOne(fetch = FetchType.LAZY)
  private Jogador jogador;

  public Integer getId() {
    return id;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNumeroCarteiraTrabalho() {
    return numeroCarteiraTrabalho;
  }

  public void setNumeroCarteiraTrabalho(String umeroCarteiraTrabalho) {
    this.numeroCarteiraTrabalho = umeroCarteiraTrabalho;
  }

  public String getNumeroCbf() {
    return numeroCbf;
  }

  public void setNumeroCbf(String numeroCbf) {
    this.numeroCbf = numeroCbf;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }      
    if (obj == null) {
      return false;
    }      
    if (getClass() != obj.getClass()) {
      return false;
    } 
    Documento other = (Documento) obj;
    return Objects.equals(id, other.id);
  }

  

}
