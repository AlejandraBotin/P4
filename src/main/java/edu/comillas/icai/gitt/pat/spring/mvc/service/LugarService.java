package edu.comillas.icai.gitt.pat.spring.mvc.service;

import edu.comillas.icai.gitt.pat.spring.mvc.model.Lugar;
import edu.comillas.icai.gitt.pat.spring.mvc.repository.LugarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LugarService {

    @Autowired
    private LugarRepository lugarRepository;

    public List<Lugar> getAllLugares() {
        return lugarRepository.findAll();
    }

    public Optional<Lugar> getLugarById(Long id) {
        return lugarRepository.findById(id);
    }

    public Lugar saveLugar(Lugar lugar) {
        return lugarRepository.save(lugar);
    }

    public Lugar updateLugar(Long id, Lugar lugarActualizado) {
        lugarActualizado.setId(id);
        return lugarRepository.save(lugarActualizado);
    }

    public void deleteLugar(Long id) {
        lugarRepository.deleteById(id);
    }


}
