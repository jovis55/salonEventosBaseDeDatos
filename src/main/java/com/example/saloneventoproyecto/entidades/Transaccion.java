package com.example.saloneventoproyecto.entidades;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString

public class Transaccion implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="idTransaccion", length = 10, nullable = false)
    private int idTransaccion;

    @Column(name="estadoPago", length = 100, nullable = false)
    private String estadoPago;

    @Column(name="montoPago", length = 100, nullable = false)
    private String montoPago;

    @Column(name="fechaPago", nullable = false)
    private LocalDateTime fechaPago;

    @ManyToOne
    private Reserva reserva;

    




}