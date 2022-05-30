package com.trybe.acc.java.iocdi.sistemapagamentos.model;

import java.util.Objects;

public class Auth {

    private String usuario;
    private String senha;
    private String nivelDeAcesso;

    public Auth() {
    }

    public Auth(String usuario, String senha, String nivelDeAcesso) {
        this.usuario = usuario;
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auth auth = (Auth) o;
        return Objects.equals(usuario, auth.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario);
    }
}
