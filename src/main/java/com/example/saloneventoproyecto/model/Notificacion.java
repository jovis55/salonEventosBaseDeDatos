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
public class Notificacion implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idNotificacion", length = 10, nullable = false)
    private int idNotificacion;

    @Column(name="mensaje", length = 100, nullable = false)
    private String mensaje;

    @Column(name="fechaEnvio", nullable = false)
    private LocalDateTime fechaEnvio;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Duenio duenio;


    




}