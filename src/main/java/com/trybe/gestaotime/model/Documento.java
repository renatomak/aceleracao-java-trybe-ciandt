package com.trybe.gestaotime.model;

import javax.persistence.*;


@Entity
public class Documento {

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
}
