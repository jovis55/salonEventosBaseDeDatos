package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.repositories.DisponibilidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisponibilidadImpl implements DisponibilidadService{
    @Autowired
    DisponibilidadRepository disponibilidadRepository;
}
