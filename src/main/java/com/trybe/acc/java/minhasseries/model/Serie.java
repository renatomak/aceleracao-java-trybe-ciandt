package com.trybe.acc.java.minhasseries.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_serie")
public class Serie implements Serializable {
  private static final long serialVersionUID = -6996503012048232676L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String nome;

  @OneToMany(mappedBy = "serie")
  private List<Episodio> episodios = new ArrayList<>();

  public Serie(String nome) {
    this.nome = nome;
  }

  public Serie() {

  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void adicionarEpisodio(Episodio episodio) {
    this.episodios.add(episodio);
  }

  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public List<Episodio> getEpisodios() {
    return episodios;
  }

  public void setEpisodios(List<Episodio> episodios) {
    this.episodios = episodios;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Serie serie = (Serie) o;
    return Objects.equals(id, serie.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
