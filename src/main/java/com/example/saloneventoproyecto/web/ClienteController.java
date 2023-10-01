package com.example.saloneventoproyecto.web;


import com.example.saloneventoproyecto.model.Cliente;
import com.example.saloneventoproyecto.services.ClienteImpl;
import com.example.saloneventoproyecto.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/cliente")
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

}
