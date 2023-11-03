package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.SalonEvento;
import com.example.saloneventoproyecto.model.Usuario;
import com.example.saloneventoproyecto.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> buscarUsuarioId(String idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }


}
