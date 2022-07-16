package com.trybe.camadas.projeto.spring.service;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;
import com.trybe.camadas.projeto.spring.persistence.repository.EstudanteRepository;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudanteServiceImpl implements EstudanteService {

  @Autowired
  private EstudanteRepository estudanteRepository;

  @Override
  public Estudante criarEstudante(Estudante estudante) {
    return estudanteRepository.criarEstudante(estudante);
  }

  @Override
  public Estudante buscaEstudantepeloId(String id) {
    return estudanteRepository.buscaEstudantepeloId(id);
  }

  @Override
  public Estudante atualizaEstudantepeloId(String id, Estudante estudante) {
    Estudante result = buscaEstudantepeloId(id);
    if (!Objects.isNull(estudante.getNomeEstudante())) {
      result.setNomeEstudante(estudante.getNomeEstudante());
    }
    if (!Objects.isNull(estudante.getCidade())) {
      result.setCidade(estudante.getCidade());
    }
    if (!Objects.isNull(estudante.getStackFavorita())) {
      result.setStackFavorita(estudante.getStackFavorita());
    }
    return result;
  }

  @Override
  public void excluiEstudantepeloId(String id) {
    estudanteRepository.excluiEstudantepeloId(id);
  }
}
