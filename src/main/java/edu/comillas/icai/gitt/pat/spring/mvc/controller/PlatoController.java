package edu.comillas.icai.gitt.pat.spring.mvc.controller;

import edu.comillas.icai.gitt.pat.spring.mvc.model.Plato;
import edu.comillas.icai.gitt.pat.spring.mvc.service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/platos")
@CrossOrigin(origins = "*")
public class PlatoController {

    @Autowired
    private PlatoService platoService;

    @GetMapping
    public List<Plato> getAllPlatos() {
        return platoService.getAllPlatos();
    }

    @GetMapping("/{id}")
    public Optional<Plato> getPlatoById(@PathVariable Long id) {
        return platoService.getPlatoById(id);
    }

    @PostMapping
    public Plato createPlato(@RequestBody Plato plato) {
        return platoService.savePlato(plato);
    }

    @PutMapping("/{id}")
    public Plato updatePlato(@PathVariable Long id, @RequestBody Plato plato) {
        return platoService.updatePlato(id, plato);
    }

    @DeleteMapping("/{id}")
    public void deletePlato(@PathVariable Long id) {
        platoService.deletePlato(id);
    }
}
