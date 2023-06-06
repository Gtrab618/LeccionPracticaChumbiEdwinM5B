/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousarios.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Usuario
 */
@Data
@Entity
public class Persona {
    
    //id, nombre, apellido, correo, cedula, direccion, fecha_nac, instruccion, celular
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_persona")
    private int idPersona;
    
    @NotBlank(message="Alerta nombre vacio")
    private String nombre;
    
    @NotBlank(message="Alerta apellido vacio")
    private String apellido;
    
    @NotBlank(message="Alerta direccion vacia")
    private String direccion;
    
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    
    @NotBlank(message="Alerta instruccion vacia")
    private String instruccion;
    
    @NotBlank(message="Alerta celular vacion")
    private String celular;
    
    @JsonIgnore
    @OneToMany(mappedBy="per")
    private List<Usuario> listaUsu;
    
    //rol= one 
}
