package com.example.saloneventoproyecto.repositories;

import com.example.saloneventoproyecto.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,String> {
}
