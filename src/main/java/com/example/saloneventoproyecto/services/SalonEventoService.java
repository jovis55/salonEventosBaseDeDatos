package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Duenio;
import com.example.saloneventoproyecto.model.SalonEvento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface SalonEventoService {

    SalonEvento guardarSalonDispo(SalonEvento salonEvento);
    ArrayList<SalonEvento> obtenerSalones();
    SalonEvento guardarSalon(SalonEvento salonEvento);

    Optional<SalonEvento> obtenerPorId(int idSalon);

    boolean eliminarSalon(int  idSalon);
}

