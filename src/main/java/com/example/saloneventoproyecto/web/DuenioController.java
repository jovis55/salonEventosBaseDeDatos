package com.example.saloneventoproyecto.web;

import com.example.saloneventoproyecto.model.Duenio;
import com.example.saloneventoproyecto.services.ClienteImpl;
import com.example.saloneventoproyecto.services.DuenioImpl;
import com.example.saloneventoproyecto.services.DuenioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/duenios")
@CrossOrigin(origins = "http://localhost:4200")

public class DuenioController {
    @Autowired
    DuenioImpl duenioService;

    @GetMapping()
    public ArrayList<Duenio> obtenerDuenios(){
        return duenioService.obtenerDuenios();
    }
    @PostMapping()
    public Duenio guardarDuenio(@RequestBody Duenio duenio){
        return this.duenioService.guardarDuenio(duenio);
    }

    @DeleteMapping(path = "/{idUsuario}")
    public String eliminarDuenio(@PathVariable String idUsuario) {
        boolean ok = duenioService.eliminarDuenio(idUsuario);
        if(ok){
            return "Se elimino el usuario con id "+idUsuario;
        }else{
            return "No pudo eliminar el usuario con id" + idUsuario;
        }
    }


    @GetMapping(path = "/{idUsuario}")
    public Optional<Duenio> obtenerPorId(@PathVariable String idUsuario){
        return duenioService.obtenerPorId(idUsuario);
    }
}
