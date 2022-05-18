package com.trybe.gestaotime.dao;

import com.trybe.gestaotime.model.Documento;

import java.util.List;

public class DocumentoDao extends GenericDao<Documento, Integer> {

    @Override
    public void salvar(Documento entity) {
        super.salvar(entity);
    }

    @Override
    public void editar(Documento entity) {
        super.editar(entity);
    }

    @Override
    public void deletar(Integer id) {
    }

    @Override
    public List<Documento> listar() {
        return super.listar();
    }

    @Override
    public Documento findById(Long id) {
        return null;
    }


}
