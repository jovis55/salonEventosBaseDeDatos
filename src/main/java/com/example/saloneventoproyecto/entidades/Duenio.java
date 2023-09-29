package com.example.saloneventoproyecto.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Duenio extends Usuario implements Serializable {


    @Column(name="nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name="telefono", length = 20, nullable = false)
    private String telefono;

    @Column(name="biografia", length = 100, nullable = false)
    private String biografia;

    @Column(name="fechaNacimiento", nullable = false)
    private Date fechaNacimiento;

    @Column(name="direccion", length = 100, nullable = false)
    private String direccion;

    @OneToMany(mappedBy = "duenio")
    private List<SalonEvento> salonEventoList ;

    @OneToMany(mappedBy = "duenio")
    private List<Notificacion> notificacionList ;
}