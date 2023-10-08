package com.example.saloneventoproyecto.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Data
public class Transaccion implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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