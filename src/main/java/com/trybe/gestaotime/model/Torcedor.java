package com.trybe.gestaotime.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Torcedor {

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
}
