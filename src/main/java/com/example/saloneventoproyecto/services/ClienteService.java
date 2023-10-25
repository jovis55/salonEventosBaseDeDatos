package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Cliente;
import com.example.saloneventoproyecto.model.Duenio;

import java.util.ArrayList;
import java.util.Optional;

public interface ClienteService {
    ArrayList<Cliente> obtenerClientes();
    Cliente guardarCliente(Cliente cliente);
    Optional<Cliente> obtenerPorId(String idUsuario);
}
