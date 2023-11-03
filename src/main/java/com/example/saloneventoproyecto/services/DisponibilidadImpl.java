package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Disponibilidad;
import com.example.saloneventoproyecto.model.SalonEvento;
import com.example.saloneventoproyecto.repositories.DisponibilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisponibilidadImpl implements DisponibilidadService{
    private final DisponibilidadRepository disponibilidadRepository;

    @Autowired
    public DisponibilidadImpl(DisponibilidadRepository disponibilidadRepository) {
        this.disponibilidadRepository = disponibilidadRepository;
    }

    @Override
    public Disponibilidad saveDisponibilidad(Disponibilidad disponibilidad) {
        return disponibilidadRepository.save(disponibilidad);
    }

    @Override
    public ArrayList<Disponibilidad> obtenerDisponibilidades(){
        return (ArrayList<Disponibilidad>) disponibilidadRepository.findAll();
    }


    @Override
    public Disponibilidad getDisponibilidadById(int id) {
        return disponibilidadRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteDisponibilidad(int id) {
        disponibilidadRepository.deleteById(id);
    }
}


