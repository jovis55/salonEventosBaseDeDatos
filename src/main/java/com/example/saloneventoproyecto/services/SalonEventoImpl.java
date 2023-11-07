package com.example.saloneventoproyecto.services;

import com.example.saloneventoproyecto.model.Disponibilidad;
import com.example.saloneventoproyecto.model.Duenio;
import com.example.saloneventoproyecto.model.SalonEvento;
import com.example.saloneventoproyecto.repositories.DuenioRepository;
import com.example.saloneventoproyecto.repositories.SalonEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class SalonEventoImpl implements SalonEventoService{


    private final SalonEventoRepository salonEventoRepository;
    public SalonEventoImpl(SalonEventoRepository salonEventoRepository){
        this.salonEventoRepository = salonEventoRepository;
    }


    @Override
    public SalonEvento guardarSalonDispo(SalonEvento salonEvento) {
        System.out.println("ya se va a guardar en el repositorio");
        return this.salonEventoRepository.save(salonEvento);
    }

    @Override
    public ArrayList<SalonEvento> obtenerSalones(){
        return (ArrayList<SalonEvento>) this.salonEventoRepository.findAll();
    }

    @Override
    public SalonEvento guardarSalon(SalonEvento salonEvento) {
        return this.salonEventoRepository.save(salonEvento);
    }
    @Override
    public Optional<SalonEvento> obtenerPorId(int idSalon) {
        return this.salonEventoRepository.findById(idSalon);
    }

    public boolean eliminarSalon(int idSalon) {
        try {
            this.salonEventoRepository.deleteById(idSalon);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    //permite modificar los dias disponibles
    @Transactional
    public SalonEvento actualizarDisponibilidades(int salonEventoId, List<Disponibilidad> nuevasDisponibilidades) {
        System.out.println("Comenzando a actualizar el salón");
        System.out.println("ID del salón: " + salonEventoId);

        Optional<SalonEvento> salonOptional = this.salonEventoRepository.findById(salonEventoId);
        SalonEvento salonExistente = salonOptional.get();


        List<Disponibilidad> disponibilidadList = new ArrayList<>();

        for (Disponibilidad disponibilidad : nuevasDisponibilidades) {


            disponibilidad.setSalon(salonExistente);
            disponibilidad.getSalon().setIdSalon(salonEventoId);
            System.out.println("salon creado");
            //disponibilidad.getSalon().setIdSalon(salonEventoId);// Asigna el objeto SalonEvento a la Disponibilidad

            System.out.println("salon creado y asignar el id");
            disponibilidadList.add(disponibilidad);
        }
        salonExistente.setDisponibilidadList(disponibilidadList);
        SalonEvento salonActualizado =  this.salonEventoRepository.save(salonExistente);
        return salonActualizado;
    }


}
