package com.example.saloneventoproyecto.web;

import com.example.saloneventoproyecto.model.Duenio;
import com.example.saloneventoproyecto.model.SalonEvento;
import com.example.saloneventoproyecto.services.ClienteImpl;
import com.example.saloneventoproyecto.services.DuenioImpl;
import com.example.saloneventoproyecto.services.SalonEventoImpl;
import com.example.saloneventoproyecto.services.SalonEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/salones")
public class SalonEventoController {

    @Autowired
    SalonEventoImpl salonEventoService;



    @GetMapping()
    public ArrayList<SalonEvento> getSalones() {
        return salonEventoService.obtenerSalones();
    }


    @PostMapping()
    public SalonEvento guardarSalon(@RequestBody SalonEvento salonEvento){
        return this.salonEventoService.guardarSalon(salonEvento);
    }

    @DeleteMapping(path = "/{idSalon}")
    public String eliminarSalon(@PathVariable int idSalon) {
        boolean ok = salonEventoService.eliminarSalon(idSalon);
        if(ok){
            return "Se elimino el salon con id "+idSalon;
        }else{
            return "No pudo eliminar el salon con id" + idSalon;
        }
    }


    @GetMapping(path = "/{idSalon}")
    public Optional<SalonEvento> obtenerPorId(@PathVariable int idSalon){
        return salonEventoService.obtenerPorId(idSalon);
    }


}
