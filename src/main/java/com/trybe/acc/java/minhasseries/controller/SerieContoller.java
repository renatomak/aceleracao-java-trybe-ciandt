package com.trybe.acc.java.minhasseries.controller;

import com.trybe.acc.java.minhasseries.model.Serie;
import com.trybe.acc.java.minhasseries.service.SerieService;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping("/series")
public class SerieContoller {

  @Autowired
  private SerieService serieService;

  @GetMapping
  public ResponseEntity<List<Serie>> findAll() {
    List<Serie> list = serieService.findAllPaged();
    return ResponseEntity.ok(list);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Serie> findById(@PathVariable Integer id) {
    return ResponseEntity.ok(serieService.findById(id));
  }

  /**
   * Method create.
   * @param serie type Serie.
   * @return RsponseEntity type Serie.
   */
  @PostMapping
  public ResponseEntity<Serie> create(@RequestBody Serie serie) {
    serie = serieService.create(serie);
    return ResponseEntity.ok(serie);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<Serie> update(@PathVariable Integer id, @RequestBody Serie serie) {
    return ResponseEntity.ok(serieService.update(id, serie));
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Integer id) {
    serieService.delete(id);
    return ResponseEntity.ok().build();
  }
}
