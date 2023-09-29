package com.example.saloneventoproyecto.entidades;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Getter
@Setter
@ToString

public class Disponibilidad implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.AUTO)
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
