package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Disponibilidad;
import com.example.saloneventoproyecto.model.SalonEvento;

import java.util.ArrayList;
import java.util.List;

public interface DisponibilidadService {
    Disponibilidad saveDisponibilidad(Disponibilidad disponibilidad);
    ArrayList<Disponibilidad> obtenerDisponibilidades();
    Disponibilidad getDisponibilidadById(int id);
    void deleteDisponibilidad(int id);

}
