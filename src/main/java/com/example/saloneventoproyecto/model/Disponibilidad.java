package com.example.saloneventoproyecto.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@ToString
@Data
public class Disponibilidad implements Serializable {

    //Se arreglaron distintos errores de incompatibilidad en esta clase
    //al momento de ser relacionada con otras clases y con la base
    //de datos
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDisponibilidad", length = 10, nullable = false)
    private int idDisponibilidad;

    @Column(name="estado", length = 100, nullable = false)
    private String estado;

    @Column(name="hora", length = 100, nullable = false)
    private String hora;

    @Column(name="fecha", nullable = false)
    private Date fecha;

    @ManyToOne
    private SalonEvento salon;

}
