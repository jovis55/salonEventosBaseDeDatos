package com.example.saloneventoproyecto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@Data
public class Administrador extends Usuario implements Serializable {
    @Column(name="nombre", length = 100, nullable = false)
    private String nombre;



}