package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.SalonEvento;

import java.util.List;

public interface SalonEventoService {

    void createSalon(SalonEvento salon);
    List<SalonEvento> getSalones ();
}
