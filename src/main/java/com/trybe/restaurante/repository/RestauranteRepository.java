package com.trybe.restaurante.repository;

import com.trybe.restaurante.entity.RestauranteEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

/**
 * Classe RestauranteRepository.
 **/

public class RestauranteRepository implements PanacheRepositoryBase<RestauranteEntity, Long> {
}
