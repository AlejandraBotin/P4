package edu.comillas.icai.gitt.pat.spring.mvc.repository;

import edu.comillas.icai.gitt.pat.spring.mvc.model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LugarRepository extends JpaRepository<Lugar, Long> {
    List<Lugar> findAll();

    Optional<Lugar> findById(Long id);

    Lugar save(Lugar lugar);

    void deleteById(Long id);
}
