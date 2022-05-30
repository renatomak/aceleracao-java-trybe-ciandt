package com.trybe.acc.java.minhasseries.service;

import com.trybe.acc.java.minhasseries.model.Episodio;
import com.trybe.acc.java.minhasseries.model.Serie;
import com.trybe.acc.java.minhasseries.repository.EpisodioRepository;
import com.trybe.acc.java.minhasseries.repository.SerieRepository;
import com.trybe.acc.java.minhasseries.service.exceptions.ResourceNotFoundException;
import com.trybe.acc.java.minhasseries.service.exceptions.SerieExistenteException;
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

  @Autowired
  private EpisodioRepository episodioRepository;


  @Transactional(readOnly = true)
  public List<Serie> findAll() {
    return serieRepository.findAll();
  }

  @Transactional(readOnly = true)
  public List<Episodio> findAll(Integer serieId) {
    return episodioRepository.findBySerieId(serieId);
  }

  @Transactional(readOnly = true)
  public Serie findById(Integer id) {
    Optional<Serie> serie = serieRepository.findById(id);
    return serie.orElseThrow(() -> new ResourceNotFoundException("Entidade não encontrada"));
  }

  /**
   * Method insert.
   * 
   * @param entity type Serie.
   * @return serie type Serie.
   */
  @Transactional
  public Serie create(Serie entity) {
    Boolean entityExists = serieRepository.existsByNome(entity.getNome());
    if (entityExists) {
      throw new SerieExistenteException();
    }
    return serieRepository.save(entity);
  }

  /**
   * Method insert.
   *
   * @param entity type Episodio.
   * @return episodio type Episodio.
   */
  @Transactional
  public Serie create(Integer serieId, Episodio entity) {
    Serie serie = this.findById(serieId);
    entity.setSerie(serie);
    episodioRepository.save(entity);
    serie.adicionarEpisodio(entity);
    return serie;
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
