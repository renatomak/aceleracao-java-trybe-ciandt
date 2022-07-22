package com.trybe.cars.controller;


import com.trybe.cars.model.Car;
import com.trybe.cars.service.CarsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/cars")
public class CarsController {

  @Autowired
  private CarsService service;

  /**
   * Method get all cars.
   * 
   * @return response entity.
   */
  @GetMapping
  public ResponseEntity<List<Car>> getAllCars() {

    List<Car> cars = service.getAllCars();

    return ResponseEntity.ok().body(cars);
  }

}
