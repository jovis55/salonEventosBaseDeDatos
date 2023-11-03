package com.example.saloneventoproyecto.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@Entity
@Getter
@Setter
@ToString

public class Disponibilidad implements Serializable {

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

    //@ManyToOne(fetch = FetchType.EAGER)
    //@ManyToOne
    //@JoinColumn(name = "salon_evento_idSalon")
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "salon_evento_id_salon")
    private SalonEvento salon;

}
