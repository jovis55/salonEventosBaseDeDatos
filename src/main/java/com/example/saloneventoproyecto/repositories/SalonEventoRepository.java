package com.example.saloneventoproyecto.repositories;

import com.example.saloneventoproyecto.model.SalonEvento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonEventoRepository extends CrudRepository<SalonEvento, Integer> {
}
