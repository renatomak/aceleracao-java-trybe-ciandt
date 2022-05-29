package app.trybe.specialityapp.service;

import app.trybe.specialityapp.commons.ApplicationError;
import app.trybe.specialityapp.commons.ResponseMessage;
import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.repository.ProfessionalRepository;
import app.trybe.specialityapp.service.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.persistence.EntityNotFoundException;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;


@Service
public class ProfessionalService {

  @Autowired
  ProfessionalRepository professionalRepository;

  /**
   * Method get all.
   * 
   * @return List type Professional.
   * @throws ResourceNotFoundException type resourceNotFound.
   */
  public List<Professional> findAll() throws ResourceNotFoundException {
    List<Professional> professionals = professionalRepository.findAll();

    if (professionals.isEmpty()) {
      throw new ResourceNotFoundException("Nenhum registro foi encontrado!");
    }
    return professionals;
  }

  /**
   * Method find by id.
   * 
   * @param id type Integer.
   * @return Object type object.
   */
  public Object findById(Integer id) {
    // return professionalRepository.findById(id).orElseThrow(() -> new
    // ResourceNotFoundException("Entidade não encontrada"));
    try {
      return professionalRepository.findById(id).get();
    } catch (NoSuchElementException e) {
      ApplicationError err =
          new ApplicationError(Response.Status.NOT_FOUND, "Entidade não encontrada");
      return err;
    }

  }

  /**
   * Method insert.
   *
   * @param entity type Professional.
   * @return type Professional.
   */
  public Professional insert(Professional entity) throws ResourceNotFoundException {
    if (!Objects.isNull(entity.getId())) {
      throw new ResourceNotFoundException(ResponseMessage.mensageErroExplicitId);
    }
    return professionalRepository.save(entity);
  }

  /**
   * Method update.
   *
   * @param id type Integer.
   * @param entity type Professional.
   * @return type Professional.
   */
  public Professional edit(Integer id, Professional entity) throws NoSuchElementException {
    Professional result = professionalRepository.findById(id).get();

    if (!Objects.isNull(entity.getName())) {
      result.setName(entity.getName());
    }

    if (!Objects.isNull(entity.getSpeciality())) {
      result.setSpeciality(entity.getSpeciality());
    }
    result = professionalRepository.save(result);
    return result;
  }

  /**
   * Method delete.
   *
   * @param id type Integer.
   */
  public void delete(Integer id) throws EmptyResultDataAccessException {
    professionalRepository.deleteById(id);
  }
}
