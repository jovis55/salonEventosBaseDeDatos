package com.example.saloneventoproyecto.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@Data
public class Resenia implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idReseña", length = 10, nullable = false)
    private int idReseña;

    @Column(name="comentario", length = 100, nullable = false)
    private String comentario;

    @Column(name="calificacion", length = 1, nullable = false)
    private double calificacion;

    @ManyToOne
    private SalonEvento salon;






}