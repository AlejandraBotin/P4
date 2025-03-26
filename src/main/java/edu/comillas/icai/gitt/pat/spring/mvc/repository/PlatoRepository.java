package edu.comillas.icai.gitt.pat.spring.mvc.repository;

import edu.comillas.icai.gitt.pat.spring.mvc.model.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlatoRepository extends JpaRepository<Plato, Long> {
    List<Plato> findAll();

    Optional<Plato> findById(Long id);

    Plato save(Plato plato);

    void deleteById(Long id);
}
