package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Administrador;
import com.example.saloneventoproyecto.model.Cliente;
import com.example.saloneventoproyecto.model.Duenio;
import com.example.saloneventoproyecto.repositories.AdministradorRepository;
import com.example.saloneventoproyecto.repositories.DuenioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DuenioImpl implements DuenioService {
    @Autowired
    DuenioRepository duenioRepository;

    @Override
    public ArrayList<Duenio> obtenerDuenios(){
        return (ArrayList<Duenio>) duenioRepository.findAll();
    }

    @Override
    public Duenio guardarDuenio(Duenio Duenio){
        return duenioRepository.save(Duenio);
    }

    @Override
    public boolean eliminarDuenio(String idUsuario) {
        try {
            duenioRepository.deleteById(idUsuario);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
    @Override
    public Optional<Duenio> obtenerPorId(String idUsuario){
        return duenioRepository.findById(idUsuario);
    }
}
