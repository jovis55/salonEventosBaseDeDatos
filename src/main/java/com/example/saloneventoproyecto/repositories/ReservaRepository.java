package com.example.saloneventoproyecto.repositories;

import com.example.saloneventoproyecto.model.Reserva;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends CrudRepository<Reserva,Integer> {
}
