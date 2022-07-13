package com.trybe.camadas.projeto.spring.persistence.repository;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EstudanteRepositoryImpl implements EstudanteRepository {

  private static List<Estudante> estudantes = new ArrayList<>();

  @Override
  public Estudante criarEstudante(Estudante estudante) {
    estudantes.add(estudante);
    return estudante;
  }

  @Override
  public Estudante buscaEstudantepeloId(String id) {
    return estudantes.stream().filter(item -> item.getId().equals(id)).collect(Collectors.toList())
        .get(0);
  }

  @Override
  public Estudante atualizaEstudantepeloId(String id, Estudante estudante) {
    if (estudantes.size() > 0) {
      Estudante oldOne = buscaEstudantepeloId(id);
      estudantes.remove(oldOne);
      estudantes.add(estudante);
    }
    return estudante;
  }

  @Override
  public void excluiEstudantepeloId(String id) {
    Estudante estudante = buscaEstudantepeloId(id);
    estudantes.remove(estudante);
  }
}
