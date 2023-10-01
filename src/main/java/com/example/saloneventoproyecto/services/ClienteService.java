package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Cliente;

import java.util.ArrayList;

public interface ClienteService {
    ArrayList<Cliente> obtenerClientes();
    Cliente guardarCliente(Cliente cliente);
}
