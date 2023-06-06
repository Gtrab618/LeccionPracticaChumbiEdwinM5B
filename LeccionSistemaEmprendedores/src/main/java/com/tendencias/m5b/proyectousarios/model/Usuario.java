package com.tendencias.m5b.proyectousarios.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 *
 * @author Usuario
 */
@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Usuario")
    private int idUsuario;

    @Size(min = 3, max = 10, message = "El nombre debe ser > 3 y < 10")
    @NotBlank(message = "Alerta usuario vacio")
    @Column(name = "nombre")
    private String nombre;

    @NotBlank(message = "Alerta clave vacia")
    @Column(name = "clave")
    private String clave;

    @Email(message = "Ingrese un correo electronico")
    @Column(name = "email")
    private String email;

    @Column(name = "estado")
    private int estado;

    @ManyToOne
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    private Persona per;

    @ManyToOne
    @JoinColumn(name = "id_rol", referencedColumnName = "id_rol")
    private Rol rol;
    
}
