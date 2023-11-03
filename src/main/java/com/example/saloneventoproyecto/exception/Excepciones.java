package com.example.saloneventoproyecto.exception;

public class Excepciones extends RuntimeException {
    public Excepciones(String idUsuario) {
        super("Cliente no encontrado con el ID de usuario: " + idUsuario);
    }
}

