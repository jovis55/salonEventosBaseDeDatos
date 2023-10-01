package com.example.saloneventoproyecto.repositories;

import com.example.saloneventoproyecto.model.Transaccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Transaccionrepository extends CrudRepository<Transaccion,Integer> {
}
