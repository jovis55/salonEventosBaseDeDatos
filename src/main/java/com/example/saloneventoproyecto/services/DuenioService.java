package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Cliente;
import com.example.saloneventoproyecto.model.Duenio;
import com.example.saloneventoproyecto.repositories.AdministradorRepository;
import com.example.saloneventoproyecto.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public interface DuenioService {
    ArrayList<Duenio> obtenerDuenios();
    Duenio guardarDuenio(Duenio duenio);
    Optional<Duenio> obtenerPorId(String idUsuario);
    boolean eliminarDuenio(String id);
}
