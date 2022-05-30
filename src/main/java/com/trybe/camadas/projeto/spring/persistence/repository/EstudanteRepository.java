package com.trybe.camadas.projeto.spring.persistence.repository;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository {

  Estudante criarEstudante(Estudante estudante);

  Estudante buscaEstudantepeloId(String id);

  Estudante atualizaEstudantepeloId(String id, Estudante estudante);

  void excluiEstudantepeloId(String id);

}
