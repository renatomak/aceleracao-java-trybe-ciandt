package com.trybe.restaurante.repository;

import com.trybe.restaurante.entity.RestauranteEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class RestauranteRepository implements PanacheRepositoryBase<RestauranteEntity, Long> {
}
