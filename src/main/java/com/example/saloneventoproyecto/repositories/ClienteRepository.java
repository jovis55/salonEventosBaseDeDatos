package com.example.saloneventoproyecto.repositories;

import com.example.saloneventoproyecto.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,String> {
}
