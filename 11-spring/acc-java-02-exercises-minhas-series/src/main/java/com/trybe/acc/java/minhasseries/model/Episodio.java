package com.trybe.acc.java.minhasseries.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_episodio")
public class Episodio implements Serializable {
  private static final long serialVersionUID = -8194331057711583877L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private Integer numero;

  private Integer duracaoEmMinutos;


  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
  @JoinColumn(name = "serie_id", nullable = false)
  @JsonBackReference
  private Serie serie;

  /**
   * Method constructor.
   * 
   * @param id type Integer.
   * @param numero type Integer.
   * @param duracaoEmMinutos type Integer.
   * @param serie type Serie.
   */
  public Episodio(Integer id, Integer numero, Integer duracaoEmMinutos, Serie serie) {
    this.id = id;
    this.numero = numero;
    this.duracaoEmMinutos = duracaoEmMinutos;
    this.serie = serie;
  }


  /**
   * Method constructor.
   * 
   * @param numero type Integer.
   * @param duracaoEmMinutos type Integer.
   * @param serie type Serie.
   */
  public Episodio(Integer numero, Integer duracaoEmMinutos, Serie serie) {
    this.numero = numero;
    this.duracaoEmMinutos = duracaoEmMinutos;
    this.serie = serie;
  }

  public Episodio() {}

  public Episodio(Integer numero, Integer duracaoEmMinutos) {
    this.numero = numero;
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public Integer getDuracaoEmMinutos() {
    return duracaoEmMinutos;
  }

  public void setDuracaoEmMinutos(Integer duracaoEmMinutos) {
    this.duracaoEmMinutos = duracaoEmMinutos;
  }

  public Serie getSerie() {
    return serie;
  }

  public void setSerie(Serie serie) {
    this.serie = serie;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Episodio episodio = (Episodio) o;
    return id.equals(episodio.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
