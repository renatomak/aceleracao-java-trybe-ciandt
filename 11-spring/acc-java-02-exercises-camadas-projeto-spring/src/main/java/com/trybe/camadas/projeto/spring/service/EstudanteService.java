package com.trybe.camadas.projeto.spring.service;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;

public interface EstudanteService {

  Estudante criarEstudante(Estudante estudante);

  Estudante buscaEstudantepeloId(String id);

  Estudante atualizaEstudantepeloId(String id, Estudante estudante);

  void excluiEstudantepeloId(String id);

}
