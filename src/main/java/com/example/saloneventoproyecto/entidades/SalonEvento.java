package com.example.saloneventoproyecto.entidades;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString

public class SalonEvento implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idSalon", length = 10, nullable = false)
    private int idSalon;

    @Column(name="nombre", length = 100, nullable = false)
    private String nombre;

    @Column(name="capacidad", length = 100, nullable = false)
    private String capacidad;

    @Column(name="ubicacion", length = 100, nullable = false)
    private String ubicacion;

    @Column(name="servicioIncluido", length = 3, nullable = false)
    private String servicioIncluido;

    @Column(name="foto", length = 100, nullable = false)
    private String foto;

    @ManyToOne
    private Duenio duenio;

    @OneToMany(mappedBy = "salon")
    private List<Resenia> reseniaList;

    @OneToMany(mappedBy = "salon")
    private List<Disponibilidad> disponibilidadList ;

    @OneToMany(mappedBy = "salon")
    private List<Reserva> reservaList;



}