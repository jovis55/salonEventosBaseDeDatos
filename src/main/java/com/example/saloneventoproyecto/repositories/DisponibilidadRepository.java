package com.example.saloneventoproyecto.repositories;

import com.example.saloneventoproyecto.model.Disponibilidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisponibilidadRepository extends CrudRepository<Disponibilidad,Integer> {
}
