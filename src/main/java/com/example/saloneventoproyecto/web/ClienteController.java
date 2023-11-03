package com.example.saloneventoproyecto.web;


import com.example.saloneventoproyecto.exception.Excepciones;
import com.example.saloneventoproyecto.model.Cliente;
import com.example.saloneventoproyecto.services.ClienteImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {
    @Autowired
    ClienteImpl clienteService;

    @GetMapping()
    public ArrayList<Cliente> obtenerClientes(){
        return clienteService.obtenerClientes();
    }
    @PostMapping()
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return this.clienteService.guardarCliente(cliente);
    }
    @GetMapping(path = "/{idUsuario}")
    public Cliente obtenerPorId(@PathVariable String idUsuario) {
        Optional<Cliente> clienteOptional = clienteService.obtenerPorId(idUsuario);

        if (clienteOptional.isPresent()) {
            return clienteOptional.get();
        } else {
            throw new Excepciones(idUsuario);
        }
    }

}
