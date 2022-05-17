package com.trybe.gestaotime.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "time", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jogador> jogadores = new ArrayList<>();

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "relacionamento_time_torcedor",
            joinColumns = {@JoinColumn(name = "time_id")},
            inverseJoinColumns = {@JoinColumn(name = "torcedor_id")})
    private List<Torcedor> torcedores = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public List<Torcedor> getTorcedores() {
        return torcedores;
    }

    public void setTorcedores(List<Torcedor> torcedores) {
        this.torcedores = torcedores;
    }
}
