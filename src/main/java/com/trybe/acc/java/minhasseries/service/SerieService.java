package com.trybe.acc.java.minhasseries.service;

import com.trybe.acc.java.minhasseries.model.Serie;
import com.trybe.acc.java.minhasseries.repository.SerieRepository;
import com.trybe.acc.java.minhasseries.service.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class SerieService {

  @Autowired
  private SerieRepository serieRepository;


  @Transactional(readOnly = true)
  public List<Serie> findAllPaged() {
    return serieRepository.findAll();
  }

  @Transactional(readOnly = true)
  public Serie findById(Integer id) {
    Optional<Serie> serie = serieRepository.findById(id);
    return serie.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
  }

  @Transactional
  public Serie create(Serie entity) {
    return serieRepository.save(entity);
  }

  /**
   * Method update.
   * 
   * @param id type Integer.
   * @param serie type Serie.
   * @return serie type Serie.
   */
  @Transactional
  public Serie update(Integer id, Serie serie) {
    try {
      Serie entity = serieRepository.getById(id);
      entity.setNome(serie.getNome());
      // entity.setEpisodios(serie.getEpisodios());

      return serieRepository.save(entity);
    } catch (EntityNotFoundException e) {
      throw new ResourceNotFoundException("ID " + id + " não encontrado.");
    }
  }

  /**
   * Method delete.
   * 
   * @param id type Integer.
   */
  public void delete(Integer id) {
    try {
      serieRepository.deleteById(id);
    } catch (EmptyResultDataAccessException e) {
      throw new ResourceNotFoundException("ID " + id + " não encontrado.");
    }
  }

}
