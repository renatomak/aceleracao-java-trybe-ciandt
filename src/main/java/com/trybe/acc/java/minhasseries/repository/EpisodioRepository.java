package com.trybe.acc.java.minhasseries.repository;

import com.trybe.acc.java.minhasseries.model.Episodio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpisodioRepository extends JpaRepository<Episodio, Integer> {
  List<Episodio> findBySerieId(Integer id);
}
