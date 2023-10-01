package com.example.saloneventoproyecto.web;

import com.example.saloneventoproyecto.model.SalonEvento;
import com.example.saloneventoproyecto.services.SalonEventoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salones")
public class SalonEventoController {

    private SalonEventoService salonEventoService;

    public SalonEventoController(SalonEventoService salonEventoService) {
        this.salonEventoService = salonEventoService;
    }

    @PostMapping()
    public void createSalon(@RequestBody SalonEvento salonEvento){
        salonEventoService.createSalon(salonEvento);
    }

    @GetMapping()
    public List<SalonEvento> getSalones() {
        return salonEventoService.getSalones();
    }


}
