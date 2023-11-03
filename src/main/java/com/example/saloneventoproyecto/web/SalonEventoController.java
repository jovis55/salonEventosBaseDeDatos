package com.example.saloneventoproyecto.web;

import com.example.saloneventoproyecto.model.Disponibilidad;
import com.example.saloneventoproyecto.model.Duenio;
import com.example.saloneventoproyecto.model.SalonEvento;
import com.example.saloneventoproyecto.services.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/salones")
@CrossOrigin(origins = "http://localhost:4200")
public class SalonEventoController {


    private  SalonEventoImpl salonEventoService;
    private CloudinaryService cloudinaryService;
    public SalonEventoController(SalonEventoImpl salonEventoService, CloudinaryService cloudinaryService){
        this.salonEventoService = salonEventoService;
        this.cloudinaryService = cloudinaryService;
    }

    @GetMapping()
    public ArrayList<SalonEvento> getSalones() {
        return salonEventoService.obtenerSalones();
    }

    @PutMapping("/crearSalonDispo")
    public SalonEvento guardarSalonDispo(@RequestBody SalonEvento salonEvento){
        System.out.println("SE VA A A REGUARDAR EL SALON CON DISPO");
        return salonEventoService.guardarSalonDispo(salonEvento);
    }



    @PostMapping()
    public SalonEvento guardarSalon(@RequestParam("imagen") MultipartFile imagen, @RequestParam("nombre") String nombre, @RequestParam("capacidad") String capacidad, @RequestParam("ubicacion") String ubicacion, @RequestParam("servicioIncluido") String servicioIncluido, @RequestParam("duenio") String duenioId) {
        try {
            Map result = cloudinaryService.cargarImagen(imagen);
            String imageUrl = (String) result.get("url");
            System.out.println(capacidad);
            Duenio duenio = new Duenio();
            SalonEvento salonEvento = new SalonEvento();
            salonEvento.setImagenUrl(imageUrl);
            salonEvento.setNombre(nombre);
            salonEvento.setCapacidad(capacidad);
            salonEvento.setUbicacion(ubicacion);
            salonEvento.setServicioIncluido(servicioIncluido);
            salonEvento.setDuenio(duenio);
            salonEvento.getDuenio().setIdUsuario(duenioId);

            SalonEvento savedSalon = salonEventoService.guardarSalon(salonEvento);


            System.out.println("Salón guardado con éxito");

            return savedSalon;
        } catch (Exception e) {
            System.err.println("Error al guardar el salón: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error al guardar el salón", e);
        }
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


    @PutMapping("/{idSalon}/actualizar-disponibilidades")
    public SalonEvento actualizarDisponibilidades(
            @PathVariable int idSalon,
            @RequestBody List<Disponibilidad> nuevasDisponibilidades) {
        System.out.println("se va a actualizar con el controlador");
        System.out.println(idSalon);
        System.out.println(nuevasDisponibilidades);
        System.out.println(nuevasDisponibilidades.size());

        return salonEventoService.actualizarDisponibilidades(idSalon, nuevasDisponibilidades);
    }


}
