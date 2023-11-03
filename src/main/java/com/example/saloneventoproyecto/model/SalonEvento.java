package com.example.saloneventoproyecto.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class SalonEvento implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idSalon", length = 10, nullable = false)
    private int idSalon;

    @Column(name="nombre", length = 100, nullable = false)
    private String nombre;


    @Column(name="capacidad", length = 100, nullable = false)
    private String capacidad;

    @Column(name="ubicacion", length = 100, nullable = false)
    private String ubicacion;

    @Column(name="servicioIncluido", length = 200, nullable = false)
    private String servicioIncluido;

    @Column(name = "imagen_url", length = 200, nullable = true)
    private String imagenUrl;

    @ManyToOne(fetch = FetchType.EAGER)
    private Duenio duenio;

    @OneToMany(mappedBy = "salon")
    private List<Resenia> reseniaList;

    //@OneToMany(mappedBy = "salon",fetch = FetchType.EAGER)
    @JsonManagedReference
    @OneToMany(mappedBy = "salon", cascade = CascadeType.ALL)

    private List<Disponibilidad> disponibilidadList ;

    @OneToMany(mappedBy = "salon")
    private List<Reserva> reservaList;



}