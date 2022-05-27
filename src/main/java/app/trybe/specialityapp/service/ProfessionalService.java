package app.trybe.specialityapp.service;

import app.trybe.specialityapp.model.Professional;
import app.trybe.specialityapp.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

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
            Professional professional = professionalRepository.getReferenceById(id);

            if (isNull(professional.getName())) {
                professional.setName(entity.getName());
            }

            if (isNull(professional.getSpeciality())) {
                professional.setSpeciality(entity.getSpeciality());
            }
            entity = professionalRepository.save(professional);
            return entity;
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
