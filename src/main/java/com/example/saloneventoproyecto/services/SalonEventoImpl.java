package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.SalonEvento;
import com.example.saloneventoproyecto.repositories.SalonEventoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalonEventoImpl implements SalonEventoService{

    private SalonEventoRepository salonEventoRepository;

    public SalonEventoImpl(SalonEventoRepository salonEventoRepository) {
        this.salonEventoRepository = salonEventoRepository;
    }

    @Override
    public void createSalon(SalonEvento salon) {
        salonEventoRepository.save(salon);
    }

    @Override
    public List<SalonEvento> getSalones() {
        Iterable<SalonEvento> iterable = salonEventoRepository.findAll();
        List<SalonEvento> salones = new ArrayList<>();
        iterable.forEach(salones::add);
        return salones;
    }
}
