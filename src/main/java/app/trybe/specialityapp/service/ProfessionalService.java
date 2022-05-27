package app.trybe.specialityapp.service;

import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.repository.ProfessionalRepository;
import java.util.List;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static java.util.Objects.isNull;


@Service
public class ProfessionalService {

  @Autowired
  private ProfessionalRepository professionalRepository;

  @Transactional(readOnly = true)
  public List<Professional> findAll() {
    return professionalRepository.findAll();
  }

  @Transactional(readOnly = true)
  public Professional findById(Integer id) {
    return professionalRepository.findById(id).get();
  }

  @Transactional
  public Professional insert(Professional entity) {
    return professionalRepository.save(entity);
  }

  @Transactional
  public Professional edit(Integer id, Professional entity) {
    try {
      Professional result = professionalRepository.findById(id).get();

      if (!isNull(entity.getName())) {
        result.setName(entity.getName());
      }

      if (!isNull(entity.getSpeciality())) {
        result.setSpeciality(entity.getSpeciality());
      }
      result = professionalRepository.save(result);
      return result;
    } catch (EntityNotFoundException e) {
      throw new EntityNotFoundException("Id not found " + id + ".");
    }
  }

  public void delete(Integer id) {
    try {
      professionalRepository.deleteById(id);
    } catch (EmptyResultDataAccessException e) {
      throw new EntityNotFoundException("Id not found " + id + ".");
    }
  }
}
