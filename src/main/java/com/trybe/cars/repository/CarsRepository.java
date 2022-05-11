package com.trybe.cars.repository;

import com.trybe.cars.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarsRepository extends JpaRepository<Car, Long> {

}
