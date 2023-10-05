package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Duenio;
import com.example.saloneventoproyecto.model.SalonEvento;
import com.example.saloneventoproyecto.repositories.DuenioRepository;
import com.example.saloneventoproyecto.repositories.SalonEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SalonEventoImpl implements SalonEventoService{

    @Autowired
    SalonEventoRepository salonEventoRepository;


    @Override
    public ArrayList<SalonEvento> obtenerSalones(){
        return (ArrayList<SalonEvento>) salonEventoRepository.findAll();
    }

    @Override
    public SalonEvento guardarSalon(SalonEvento salonEvento) {
        return salonEventoRepository.save(salonEvento);
    }
    @Override
    public Optional<SalonEvento> obtenerPorId(int idSalon) {
        return salonEventoRepository.findById(idSalon);
    }

    public boolean eliminarSalon(int idSalon) {
        try {
            salonEventoRepository.deleteById(idSalon);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
