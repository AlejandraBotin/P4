package edu.comillas.icai.gitt.pat.spring.mvc.service;

import edu.comillas.icai.gitt.pat.spring.mvc.model.Plato;
import edu.comillas.icai.gitt.pat.spring.mvc.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatoService {

    @Autowired
    private PlatoRepository platoRepository;

    public List<Plato> getAllPlatos() {
        return platoRepository.findAll();
    }

    public Optional<Plato> getPlatoById(Long id) {
        return platoRepository.findById(id);
    }

    public Plato savePlato(Plato plato) {
        return platoRepository.save(plato);
    }

    public Plato updatePlato(Long id, Plato platoActualizado) {
        platoActualizado.setId(id);
        return platoRepository.save(platoActualizado);
    }

    public void deletePlato(Long id) {
        platoRepository.deleteById(id);
    }
}
