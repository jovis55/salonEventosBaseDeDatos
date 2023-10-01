package com.example.saloneventoproyecto.repositories;

import com.example.saloneventoproyecto.model.Administrador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends CrudRepository<Administrador,String> {
}
