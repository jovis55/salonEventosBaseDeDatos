package com.example.saloneventoproyecto.repositories;

import com.example.saloneventoproyecto.model.Resenia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reseniarepository extends CrudRepository<Resenia,Integer> {
}
