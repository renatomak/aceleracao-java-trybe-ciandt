package com.trybe.restaurante.service;

import com.trybe.restaurante.dto.RestauranteDto;
import com.trybe.restaurante.entity.RestauranteEntity;
import com.trybe.restaurante.repository.RestauranteRepository;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;


@ApplicationScoped
public class RestauranteService {

  @Inject
  private RestauranteRepository restauranteRepository;

  /**
   * Method save.
   * @param dto type RestauranteDto
   * @return type RestauranteDto.
   */
  @Transactional
  public RestauranteDto salvar(RestauranteDto dto) {
    RestauranteEntity entity = new RestauranteEntity();
    entity.setNome(dto.getNome());
    entity.setDescricao(dto.getDescricao());
    restauranteRepository.persist(entity);
    return dto;
  }

}
