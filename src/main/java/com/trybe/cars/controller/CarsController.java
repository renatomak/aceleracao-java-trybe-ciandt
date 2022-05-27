package com.trybe.cars.controller;

import com.trybe.cars.service.CarsService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


/**
 * Classe CarsController.
 * 
 */

@Controller
@Path("/cars")
public class CarsController {

  @Autowired
  private CarsService carsService;

  @GET
  public Response getAllCars() {
    return Response.ok(carsService.getAllCars()).build();
  }

}
