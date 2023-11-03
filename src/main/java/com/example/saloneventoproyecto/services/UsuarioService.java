package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Usuario;

import java.util.Optional;

public interface UsuarioService {

    Optional<Usuario> buscarUsuarioId(String idUsuario);
}
