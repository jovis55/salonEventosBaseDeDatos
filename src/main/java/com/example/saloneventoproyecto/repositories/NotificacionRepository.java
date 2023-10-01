package com.example.saloneventoproyecto.repositories;

import com.example.saloneventoproyecto.model.Notificacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionRepository extends CrudRepository<Notificacion,Integer> {
}
