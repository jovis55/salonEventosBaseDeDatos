package com.example.saloneventoproyecto.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@ToString
@Data
public class Cliente extends Usuario implements Serializable {

    @Column(name="nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name="telefono", length = 20, nullable = false)
    private String telefono;

    @Column(name="fechaNacimiento", nullable = false)
    private Date fechaNacimiento;

    @Column(name="direccion", length = 20, nullable = false)
    private String direccion;

    @OneToMany(mappedBy = "cliente")
    private List<Reserva> reservaList;

    @OneToMany(mappedBy = "cliente")
    private List<Notificacion> notificacionList ;





}