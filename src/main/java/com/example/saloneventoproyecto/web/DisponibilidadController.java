package com.example.saloneventoproyecto.web;

import com.example.saloneventoproyecto.model.Disponibilidad;
import com.example.saloneventoproyecto.model.SalonEvento;
import com.example.saloneventoproyecto.repositories.SalonEventoRepository;
import com.example.saloneventoproyecto.services.DisponibilidadImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disponibilidades")
@CrossOrigin(origins = "http://localhost:4200")
public class DisponibilidadController {
    private final DisponibilidadImpl disponibilidadService;
    private final SalonEventoRepository salonEventoRepository;

    @Autowired
    public DisponibilidadController(DisponibilidadImpl disponibilidadService, SalonEventoRepository salonEventoRepository) {
        this.disponibilidadService = disponibilidadService;
        this.salonEventoRepository= salonEventoRepository;
    }

    @PostMapping("/createDisponibilidad/{idSalon}")
    public Disponibilidad createDisponibilidad(@RequestBody Disponibilidad disponibilidad, @PathVariable int idSalon) {
        System.out.println("Esta es la dispo creada: " + disponibilidad);
        Disponibilidad disponibilidad1= disponibilidad;
        Optional<SalonEvento> salonOptional = this.salonEventoRepository.findById(idSalon);
        SalonEvento salonExistente = salonOptional.get();
        disponibilidad1.setSalon(salonExistente);
        disponibilidad1.getSalon().setIdSalon(idSalon);

        return disponibilidadService.saveDisponibilidad(disponibilidad1);
    }


    @GetMapping
    public List<Disponibilidad> getAllDisponibilidades() {
        return disponibilidadService.obtenerDisponibilidades();
    }

    @GetMapping("/{id}")
    public Disponibilidad getDisponibilidadById(@PathVariable int id) {
        return disponibilidadService.getDisponibilidadById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDisponibilidad(@PathVariable int id) {
        disponibilidadService.deleteDisponibilidad(id);
    }
}
