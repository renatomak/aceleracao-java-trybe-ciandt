package com.trybe.gestaotime.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Torcedor implements Serializable {
  private static final long serialVersionUID = -477471613445719657L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String nome;

  @ManyToMany(mappedBy = "torcedores")
  private List<Time> times = new ArrayList<>();

  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Time> getTimes() {
    return times;
  }

  public void setTimes(List<Time> times) {
    this.times = times;
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
    Torcedor other = (Torcedor) obj;
    return Objects.equals(id, other.id);
  }


}
