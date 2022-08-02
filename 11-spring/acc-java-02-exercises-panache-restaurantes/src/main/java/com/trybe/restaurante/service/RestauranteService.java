package com.trybe.restaurante.service;

import com.trybe.restaurante.dto.RestauranteDto;
import com.trybe.restaurante.entity.RestauranteEntity;
import com.trybe.restaurante.repository.RestauranteRepository;
import java.util.List;
import java.util.stream.Collectors;
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

  /**
   * Method save.
   * @param dto type RestauranteDto
   * @return type RestauranteDto.
   */
  @Transactional
  public RestauranteDto atualizar(Long id, RestauranteDto dto) {
    RestauranteEntity entity = restauranteRepository.findById(id);
    entity.setNome(dto.getNome());
    entity.setDescricao(dto.getDescricao());
    restauranteRepository.persist(entity);
    return dto;
  }

  /**
   * Method findAll.
   * @return list type RestauranteDto.
   */
  public List<RestauranteDto> listar() {
    return restauranteRepository
            .findAll()
            .stream()
            .map(RestauranteDto::new)
            .collect(Collectors.toList());
  }

  public RestauranteDto buscarPorId(Long id) {
    RestauranteEntity entity = restauranteRepository.findById(id);
    return new RestauranteDto(entity);
  }

  @Transactional
  public void deletar(Long id) {
    restauranteRepository.deleteById(id);
  }

}
