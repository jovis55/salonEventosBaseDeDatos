package com.example.saloneventoproyecto.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@ToString

public class Reserva implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idReserva", length = 10, nullable = false)
    private int idReserva;

    @Column(name="estado", length = 100, nullable = false)
    private String estado;

    @Column(name="valor", length = 100, nullable = false)
    private String valor;

    @Column(name="fechaReserva", nullable = false)
    private LocalDateTime fechaReserva;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private SalonEvento salon;

    @OneToMany(mappedBy = "reserva")
    private List<Transaccion> transaccionList;
    




}