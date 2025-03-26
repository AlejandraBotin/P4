package edu.comillas.icai.gitt.pat.spring.mvc.controller;

import edu.comillas.icai.gitt.pat.spring.mvc.model.Lugar;
import edu.comillas.icai.gitt.pat.spring.mvc.service.LugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lugares")
@CrossOrigin(origins = "*")
public class LugarController {

    @Autowired
    private LugarService lugarService;

    @GetMapping
    public List<Lugar> getAllLugares() {
        return lugarService.getAllLugares();
    }

    @GetMapping("/{id}")
    public Optional<Lugar> getLugarById(@PathVariable Long id) {
        return lugarService.getLugarById(id);
    }

    @PostMapping
    public Lugar createLugar(@RequestBody Lugar lugar) {
        return lugarService.saveLugar(lugar);
    }

    @PutMapping("/{id}")
    public Lugar updateLugar(@PathVariable Long id, @RequestBody Lugar lugar) {
        return lugarService.updateLugar(id, lugar);
    }

    @DeleteMapping("/{id}")
    public void deleteLugar(@PathVariable Long id) {
        lugarService.deleteLugar(id);
    }
}
