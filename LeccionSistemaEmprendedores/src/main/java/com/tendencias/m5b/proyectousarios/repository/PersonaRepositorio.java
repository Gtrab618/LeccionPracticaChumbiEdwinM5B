/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tendencias.m5b.proyectousarios.repository;

import com.tendencias.m5b.proyectousarios.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface PersonaRepositorio extends JpaRepository<Persona,Integer>{
    
}
