package app.trybe.specialityapp.controller;

import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.service.ProfessionalService;
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
@RequestMapping("/professionals")
public class ProfessionalController {

  @Autowired
  private ProfessionalService professionalService;

  @GetMapping
  public ResponseEntity<List<Professional>> findAll() {
    List<Professional> professionals = professionalService.findAll();
    return ResponseEntity.ok(professionals);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Professional> findById(@PathVariable Integer id) {
    return ResponseEntity.ok(professionalService.findById(id));
  }

  @PostMapping
  public ResponseEntity<Professional> insert(@RequestBody Professional professional) {
    professional = professionalService.insert(professional);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
        .buildAndExpand(professional.getId()).toUri();
    return ResponseEntity.created(uri).body(professional);
  }

  @PutMapping(value = "/{id}")
  public ResponseEntity<Professional> update(@PathVariable Integer id,
      @RequestBody Professional professional) {
    return ResponseEntity.ok(professionalService.edit(id, professional));
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Integer id) {
    professionalService.delete(id);
    return ResponseEntity.noContent().build();
  }
}
