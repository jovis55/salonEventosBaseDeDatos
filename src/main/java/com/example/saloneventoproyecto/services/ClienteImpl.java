package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Cliente;
import com.example.saloneventoproyecto.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteImpl implements ClienteService{
    @Autowired
    ClienteRepository clienteRepository;

    public ArrayList<Cliente> obtenerClientes(){
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
